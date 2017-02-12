package com.matrix.platform.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.matrix.platform.common.bean.ResponseEntity;
import com.matrix.platform.common.exception.MatrixException;
import com.matrix.platform.controller.dto.UserDto;
import com.matrix.platform.entity.UserTest;
import com.matrix.platform.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController
{

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/getUsers", produces = "application/json", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDto>> getUsers()
    {
        List<UserDto> userDtos = new ArrayList<UserDto>();

        try
        {
            List<UserTest> users = userService.getUsers();

            if(users != null && !users.isEmpty())
            {
                UserDto userDto = null;
                for(UserTest userTest : users)
                {
                    userDto = new UserDto();

                    BeanUtils.copyProperties(userTest, userDto);

                    userDtos.add(userDto);
                }
            }
            return new ResponseEntity<List<UserDto>>(userDtos);
        }
        catch(MatrixException e)
        {
            log.warn(e.getMessage());
            return new ResponseEntity<List<UserDto>>(e.getCode(), e.getMessage());
        }
        catch(Exception e)
        {
            log.error(e.getMessage(), e);
            return new ResponseEntity<List<UserDto>>("1", "failed");
        }

    }
}
