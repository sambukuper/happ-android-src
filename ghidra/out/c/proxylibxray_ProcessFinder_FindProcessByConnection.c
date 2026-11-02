// proxylibxray_ProcessFinder_FindProcessByConnection @ 01c6e30c size=180
// callers:
//   Entry Point ?
//   01c6fabc Java_libxray_Libxray_00024proxyProcessFinder_findProcessByConnection

undefined8
proxylibxray_ProcessFinder_FindProcessByConnection
          (dword param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
          ,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  undefined8 uVar1;
  undefined8 in_x28;
  uint local_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_60;
  undefined8 local_50;
  
  local_50 = in_x28;
  uVar1 = _cgo_wait_runtime_init_done();
  uStack_60 = 0;
  local_a8 = (uint)param_1;
  uStack_a0 = param_2;
  uStack_98 = param_3;
  local_90 = param_4;
  local_88 = param_5;
  uStack_80 = param_6;
  uStack_78 = param_7;
  local_70 = param_8;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray_ProcessFinder_FindProcessByConnection,&local_a8,0x50,
             uVar1);
  _cgo_release_context(uVar1);
  return local_50;
}


