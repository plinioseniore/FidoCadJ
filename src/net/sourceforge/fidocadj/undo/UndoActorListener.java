package net.sourceforge.fidocadj.undo;

/**	Interface used to callback notify that an undo action on libraries should 
	be performed.
	
	<pre>
		This file is part of FidoCadJ.

    FidoCadJ is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FidoCadJ is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with FidoCadJ.  If not, see <http://www.gnu.org/licenses/>.

	</pre>
	@author Davide Bucci
*/

public interface UndoActorListener
{
	public void saveUndoState();
	public void saveUndoLibrary(String tempLibraryDirectory);
}