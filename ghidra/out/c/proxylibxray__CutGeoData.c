// proxylibxray__CutGeoData @ 01c6e540 size=140
// callers:
//   Entry Point ?
//   01c6efb0 Java_libxray_Libxray_cutGeoData

uint proxylibxray__CutGeoData
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,undefined8 param_6)

{
  undefined8 uVar1;
  uint in_x25;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 local_50;
  uint local_40;
  
  local_40 = in_x25;
  uVar1 = _cgo_wait_runtime_init_done();
  local_50 = 0;
  local_80 = param_1;
  uStack_78 = param_2;
  local_70 = param_3;
  uStack_68 = param_4;
  local_60 = param_5;
  local_58 = param_6;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__CutGeoData,&local_80,0x34,uVar1);
  _cgo_release_context(uVar1);
  return local_40 & 0xffffffff;
}


