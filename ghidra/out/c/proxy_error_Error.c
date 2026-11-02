// proxy_error_Error @ 01c6e974 size=92
// callers:
//   Entry Point ?
//   01c70dcc Java_go_Universe_00024proxyerror_error

undefined1  [16] proxy_error_Error(dword param_1)

{
  undefined1 auVar1 [16];
  undefined8 uVar2;
  undefined8 in_x20;
  undefined8 in_x30;
  uint local_30 [4];
  undefined8 local_10;
  
  local_30[3] = in_x30;
  local_10 = in_x20;
  uVar2 = _cgo_wait_runtime_init_done();
  local_30[1] = 0;
  local_30[2] = 0;
  local_30[0] = (uint)param_1;
  crosscall2(_cgoexp_5994d4b84130_proxy_error_Error,local_30,0x18,uVar2);
  _cgo_release_context(uVar2);
  auVar1._8_8_ = local_10;
  auVar1._0_8_ = local_30[3];
  return auVar1;
}


