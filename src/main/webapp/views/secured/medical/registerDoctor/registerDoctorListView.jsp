<%--
  Created by hadi tayebi.
  email: hadi.tayebi@hotmail.com
  Date: 4/10/12
  Time: 12:00 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/views/commons/tagLib.jsp" %>
<style>
    label, #gender {
        color: #000000;
        font-family: Arial, 'Arial Unicode MS', Helvetica, Sans-Serif;
        text-transform: capitalize;

    }
</style>
<p:form>
    <h2 class="art-postheader"><span class="art-postheadericon">Doctors</span></h2>
    <p:table>
        <p:column titleKey="firstName" property="person.firstName"/>
        <p:column titleKey="lastName" property="person.lastName"/>
        <p:column titleKey="nationalId" property="person.nationalId"/>
        <p:column titleKey="phone" property="person.phone"/>
        <p:column titleKey="birthDate" property="person.birthDate"/>
        <p:editCell/>

    </p:table>
    <p:button event="add" primary="true"
              valueKey="Add"/>
</p:form>
<script>

    function setSelectedRow(rowIndex) {
        $("#doctor_selected_rows").val(rowIndex);
    }
</script>
