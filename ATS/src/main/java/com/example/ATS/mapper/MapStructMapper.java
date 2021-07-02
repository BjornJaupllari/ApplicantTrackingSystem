package com.example.ATS.mapper;

import com.example.ATS.dto.*;
import com.example.ATS.entity.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    UserDto userToDto(User user);

    User userToEntity(UserDto userDto);

    TypeDto typeToDto(Type type);

    Type typeToEntity(TypeDto typeDto);

    Status statusToDto(Status status);

    Status statusToEntity(StatusDto statusDto);

    RoleDto roleToDto(Role role);

    Role roleToEntity(RoleDto roleDto);

    ResumeDto resumeToDto(Resume resume);

    Resume resumeToEntity(ResumeDto resumeDto);

    PostDto postToDto(Post post);

    Post postToEntity(PostDto postDto);

    InterviewDto interviewToDto(Interview interview);

    Interview interviewToEntity(InterviewDto interviewDto);

    GuestDto guestToDto(Guest guest);

    Guest guestToEntity(GuestDto guestDto);

    EmployeeDto employeeToDto(Employee employee);

    Employee employeeToEntity(EmployeeDto employeeDto);

    CompanyDto companyDto(Company company);

    Company companyToEntity(CompanyDto companyDto);

    ApplicantDto applicantToDto(Applicant applicant);

    Applicant applicantToEntity(ApplicantDto applicantDto);

}
