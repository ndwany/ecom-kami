package kamiz.kami.controller;

import kamiz.kami.dto.ResponseDto;
import kamiz.kami.dto.user.SignInDto;
import kamiz.kami.dto.user.SignInResponseDto;
import kamiz.kami.dto.user.SignupDto;
import kamiz.kami.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }

    @PostMapping("/signin")
    public SignInResponseDto signin(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }

}
