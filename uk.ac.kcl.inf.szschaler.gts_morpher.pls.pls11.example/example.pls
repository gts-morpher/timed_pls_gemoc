<?xml version="1.0" encoding="UTF-8"?>
<pls11:ProductionLineModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:pls11="http://www.kcl.ac.uk/metamodels/pls11">
  <elts xsi:type="pls11:GenHead" name="genHead" out="//@elts.1"/>
  <elts xsi:type="pls11:Conveyor" name="headConveyor" tray="//@elts.4"/>
  <elts xsi:type="pls11:GenHandle" name="genHandle" out="//@elts.3"/>
  <elts xsi:type="pls11:Conveyor" name="handleConveyor" tray="//@elts.4"/>
  <elts xsi:type="pls11:Tray" name="partsTray"/>
  <elts xsi:type="pls11:Assembler" name="assemble" out="//@elts.6" in="//@elts.4"/>
  <elts xsi:type="pls11:Conveyor" name="assemblerConveyor"/>
</pls11:ProductionLineModel>
