// This file is part of FidoCadJ.
// 
// FidoCadJ is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// FidoCadJ is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with FidoCadJ.  If not, see <http://www.gnu.org/licenses/>.
// 
// Copyright 2014 Kohta Ozaki

// SWING VERSION

package net.sourceforge.fidocadj.librarymodel.utils;

import net.sourceforge.fidocadj.circuit.CircuitPanel;
import net.sourceforge.fidocadj.circuit.controllers.ParserActions;
import net.sourceforge.fidocadj.circuit.model.DrawingModel;
import net.sourceforge.fidocadj.librarymodel.event.LibraryListener;
import net.sourceforge.fidocadj.librarymodel.event.AddEvent;
import net.sourceforge.fidocadj.librarymodel.event.KeyChangeEvent;
import net.sourceforge.fidocadj.librarymodel.event.RemoveEvent;
import net.sourceforge.fidocadj.librarymodel.event.RenameEvent;
import net.sourceforge.fidocadj.FidoFrame;

public class CircuitPanelUpdater implements LibraryListener
{
	FidoFrame fidoFrame;
	
	public CircuitPanelUpdater(FidoFrame fidoFrame)
	{
		this.fidoFrame = fidoFrame;
	}
	
	public void libraryLoaded()
	{
		updateCircuitPanel();
	}

	public void libraryNodeRenamed(RenameEvent e)
	{
		//NOP
	}

	public void libraryNodeRemoved(RemoveEvent e)
	{
		updateCircuitPanel();
	}

	public void libraryNodeAdded(AddEvent e)
	{
		//NOP
	}

	public void libraryNodeKeyChanged(KeyChangeEvent e)
	{
		updateCircuitPanel();
	}
	
	private void updateCircuitPanel()
	{
		CircuitPanel cp = fidoFrame.CC;
		DrawingModel ps = cp.P;
		ParserActions pa = new ParserActions(ps);
		cp.getParserActions().parseString(pa.getText(true));
		cp.repaint();
	}
}

