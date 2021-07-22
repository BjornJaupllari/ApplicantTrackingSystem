package com.example.ATS.mapper;

import com.example.ATS.dto.*;
import com.example.ATS.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    UserDto userToDto(User user);
    List<UserDto> toUserDtos(List<User>users);
    User userToEntity(UserDto userDto);


    RoleDto roleToDto(Role role);
    List<RoleDto> toRoleDtos(List<Role>roles);
    Role roleToEntity(RoleDto roleDto);

    ResumeDto resumeToDto(Resume resume);
    List<ResumeDto> toResumeDtos(List<Resume>resumes);
    Resume resumeToEntity(ResumeDto resumeDto);


    GuestDto guestToDto(Guest guest);

    Guest guestToEntity(GuestDto guestDto);



    ApplicantDto applicantToDto(Applicant applicant);

    Applicant applicantToEntity(ApplicantDto applicantDto);

}
