<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<c:forEach var="floor" items="${floors}"> 
<tiles:insertAttribute name="${floor}"/>
</c:forEach>
