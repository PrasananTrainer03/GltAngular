using System;
using System.Collections.Generic;
using System.Linq;
using System.Data;
using System.Data.SqlClient;
using System.Text;
using System.Threading.Tasks;

namespace AdoEmpCrud
{
    class EmployCrud
    {
        SqlConnection conn;
        SqlCommand cmd;

        public string DeleteEmp(int empno)
        {
            Emp res = SearchEmp(empno);
            if (res != null)
            {
                conn = ConnectionHelper.GetConnection();
                conn.Open();
                cmd = new SqlCommand("prcEmpDelete", conn);
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.AddWithValue("@empno", empno);
                cmd.ExecuteNonQuery();
                return "Record Deleted...";
            }
            return "Employ No not Found...";
        }
            public String UpdateEmp(Emp emp)
        {
            Emp res = SearchEmp(emp.Empno);
            if (res!=null)
            {
                conn = ConnectionHelper.GetConnection();
                conn.Open();
                cmd = new SqlCommand("prcEmpUpdate", conn);
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.AddWithValue("@empno", emp.Empno);
                cmd.Parameters.AddWithValue("@name", emp.Name);
                cmd.Parameters.AddWithValue("@dept", emp.Dept);
                cmd.Parameters.AddWithValue("@desig", emp.Desig);
                cmd.Parameters.AddWithValue("@basic", emp.Basic);
                cmd.ExecuteNonQuery();
                return "Record Updated Successsfully...";

            }
            return "Employ No Not Found...";
        }
        public Emp SearchEmp(int empno)
        {
            conn = ConnectionHelper.GetConnection();
            conn.Open();
            cmd = new SqlCommand("prcEmpSearch", conn);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.AddWithValue("@empno", empno);
            SqlDataReader dr = cmd.ExecuteReader();
            Emp emp = null;
            if (dr.Read())
            {
                emp = new Emp();
                emp.Empno = Convert.ToInt32(dr["empno"]);
                emp.Name = dr["nam"].ToString();
                emp.Dept = dr["dept"].ToString();
                emp.Desig = dr["desig"].ToString();
                emp.Basic = Convert.ToInt32(dr["basic"]);
            }
            return emp;
        }
        public string AddEmploy(Emp emp)
        {
            conn = ConnectionHelper.GetConnection();
            conn.Open();
            cmd = new SqlCommand("prcEmpInsert", conn);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.AddWithValue("@empno", emp.Empno);
            cmd.Parameters.AddWithValue("@name", emp.Name);
            cmd.Parameters.AddWithValue("@dept", emp.Dept);
            cmd.Parameters.AddWithValue("@desig", emp.Desig);
            cmd.Parameters.AddWithValue("@basic", emp.Basic);
            cmd.ExecuteNonQuery();
            return "Record Inserted Successsfully...";
        }
    }
}
