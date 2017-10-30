package by.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import by.it.bean.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    @Query("select distinct(d) from Department d join d.employees e where e.name = ?1")
    List<Department> getByJoinCondition(String name);
    @Query("select d from Department d join d.employees e where e.age = (select max(e.age) from Employee e)")
    List<Department> getByMaxAge();
    @Query("select d from Department d 	join d.employees e where e.name = :lastName")
    List<Department> getByEmployeesLastName(@Param("lastName") String familyName);

    @Query(value = " select d.* from Department d" +
                   " left join Employee e on d.id = e.department_id" +
                   " where e.name = ?1", nativeQuery = true)
    List<Department> getByJoinConditionNative(String name);
}
