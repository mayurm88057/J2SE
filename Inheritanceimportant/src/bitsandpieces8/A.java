package bitsandpieces8;

import java.util.Objects;
// hash code and equals contract
public class A {
	
int i;

@Override
public int hashCode() {
	return Objects.hash(i);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	A other = (A) obj;
	return i == other.i;
}

	

}
