<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

<h2>Enter Room Details</h2>

<table>
  	<form:form method="post" action="save" modelAttribute="room">
  	
  	<tr>
  		<td>Room Name:</td>
  		<td><form:input path="roomName"/></td>
  	</tr>
  	
  	<tr>
  		<td>Room No:</td>
  		<td><form:input path="roomNo"/></td>
  	</tr>
  	
  	<tr>
  		<td>Floor:</td>
  		<td><form:input path="floor"/></td>
  	</tr>
  		
  	<tr>
  		<td>Select Building:</td>
  		<td>
  		 <form:select path="buliding">
  		 <form:option value="A" label="A"/>
         <form:option value="B" label="B"/>
         <form:option value="C" label="C"/>
  		</form:select> 
        </td>    
    </tr>
  	
  	<tr>
  		<td></td>
  		<td>
  		<input type="submit" value="ADD ROOM"/>
  		</td>
  	</tr>
  	
  	</form:form>
</table>