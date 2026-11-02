.class public final Lyk4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lze2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/main/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lyk4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lyk4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lq51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lxk4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lxk4;

    .line 7
    .line 8
    iget v1, v0, Lxk4;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lxk4;->h0:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lxk4;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lxk4;-><init>(Lyk4;Lq51;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v7, Lxk4;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v7, Lxk4;->h0:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lyk4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 51
    .line 52
    :try_start_1
    iput v1, v7, Lxk4;->h0:I

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    const/16 v8, 0xf8

    .line 59
    .line 60
    move-object v1, p0

    .line 61
    move-object v2, p1

    .line 62
    invoke-static/range {v1 .. v8}, Lsu/happ/proxyutility/feature/main/MainActivity;->L(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ls51;I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    sget-object p0, Lc71;->X:Lc71;

    .line 67
    .line 68
    if-ne p2, p0, :cond_3

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_3
    :goto_2
    :try_start_2
    check-cast p2, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    move-object p0, v0

    .line 79
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 80
    .line 81
    if-nez p1, :cond_4

    .line 82
    .line 83
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 84
    .line 85
    if-nez p1, :cond_4

    .line 86
    .line 87
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_4
    throw p0
.end method

.method public final l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lyk4;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const-string v4, "binding"

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, Lkn4;

    .line 18
    .line 19
    sget v7, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 20
    .line 21
    instance-of v7, v1, Lfn4;

    .line 22
    .line 23
    iget-object v8, v0, Lyk4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 24
    .line 25
    if-eqz v7, :cond_4

    .line 26
    .line 27
    check-cast v1, Lfn4;

    .line 28
    .line 29
    iget-object v0, v1, Lfn4;->a:Lgg8;

    .line 30
    .line 31
    instance-of v1, v0, Lcg8;

    .line 32
    .line 33
    const-string v3, "1.1.1.1"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    sget v0, Ly46;->toast_dns_from_json_failed_to_retrieve_host:I

    .line 38
    .line 39
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v8, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v8, v0}, Lpu;->P(Lsu/happ/proxyutility/ui/SnackbarHostActivity;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :cond_0
    instance-of v1, v0, Ldg8;

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    sget v1, Ly46;->toast_dns_from_json_invalid_ip:I

    .line 60
    .line 61
    check-cast v0, Ldg8;

    .line 62
    .line 63
    iget-object v0, v0, Ldg8;->X:Ljava/lang/String;

    .line 64
    .line 65
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v8, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v8, v0}, Lpu;->P(Lsu/happ/proxyutility/ui/SnackbarHostActivity;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :cond_1
    instance-of v1, v0, Leg8;

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    sget v0, Ly46;->toast_dns_from_json_missing_servers_section:I

    .line 86
    .line 87
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v8, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v8, v0}, Lpu;->P(Lsu/happ/proxyutility/ui/SnackbarHostActivity;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_1

    .line 102
    .line 103
    :cond_2
    instance-of v0, v0, Lfg8;

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 110
    .line 111
    .line 112
    :goto_0
    move-object v2, v6

    .line 113
    goto/16 :goto_1

    .line 114
    .line 115
    :cond_4
    instance-of v0, v1, Lgn4;

    .line 116
    .line 117
    if-eqz v0, :cond_6

    .line 118
    .line 119
    iget-object v0, v8, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 120
    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    iget-object v0, v0, Lb6;->f0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 124
    .line 125
    invoke-static {v0, v3}, Lrp7;->e(Landroid/view/View;Z)V

    .line 126
    .line 127
    .line 128
    sget-object v0, Lvh3;->z1:Lm51;

    .line 129
    .line 130
    invoke-virtual {v8}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v1, Luh3;

    .line 135
    .line 136
    invoke-direct {v1, v5}, Luh3;-><init>(B)V

    .line 137
    .line 138
    .line 139
    sget-object v3, Lvh3;->z1:Lm51;

    .line 140
    .line 141
    sget-object v4, Ltp1;->a:Lnf1;

    .line 142
    .line 143
    sget-object v4, Ldm4;->a:Lhv2;

    .line 144
    .line 145
    new-instance v5, Ljy2;

    .line 146
    .line 147
    const/4 v7, 0x3

    .line 148
    invoke-direct {v5, v0, v1, v6, v7}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 149
    .line 150
    .line 151
    const/4 v0, 0x2

    .line 152
    invoke-static {v3, v4, v5, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 153
    .line 154
    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :cond_5
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v6

    .line 161
    :cond_6
    instance-of v0, v1, Lzm4;

    .line 162
    .line 163
    if-eqz v0, :cond_8

    .line 164
    .line 165
    iget-object v0, v8, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 166
    .line 167
    if-eqz v0, :cond_7

    .line 168
    .line 169
    iget-object v0, v0, Lb6;->f0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 170
    .line 171
    invoke-static {v0, v5}, Lrp7;->e(Landroid/view/View;Z)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_1

    .line 175
    .line 176
    :cond_7
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v6

    .line 180
    :cond_8
    instance-of v0, v1, Ljn4;

    .line 181
    .line 182
    if-eqz v0, :cond_9

    .line 183
    .line 184
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainActivity;->g0()V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :cond_9
    instance-of v0, v1, Lym4;

    .line 190
    .line 191
    if-eqz v0, :cond_a

    .line 192
    .line 193
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainActivity;->C()V

    .line 194
    .line 195
    .line 196
    goto/16 :goto_1

    .line 197
    .line 198
    :cond_a
    instance-of v0, v1, Lhn4;

    .line 199
    .line 200
    if-eqz v0, :cond_b

    .line 201
    .line 202
    sget v0, Ly46;->warning_text:I

    .line 203
    .line 204
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    sget v0, Ly46;->warning_notification_disabled:I

    .line 209
    .line 210
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    sget v0, Ly46;->settings:I

    .line 215
    .line 216
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    sget v0, Ly46;->close:I

    .line 221
    .line 222
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    new-instance v15, Lmj4;

    .line 227
    .line 228
    const/16 v0, 0xa

    .line 229
    .line 230
    invoke-direct {v15, v8, v0}, Lmj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 231
    .line 232
    .line 233
    const/16 v16, 0x0

    .line 234
    .line 235
    const/16 v17, 0x48a

    .line 236
    .line 237
    const/4 v10, 0x0

    .line 238
    const/4 v14, 0x0

    .line 239
    invoke-static/range {v8 .. v17}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :cond_b
    instance-of v0, v1, Lin4;

    .line 245
    .line 246
    if-eqz v0, :cond_c

    .line 247
    .line 248
    sget v0, Ly46;->warning_text:I

    .line 249
    .line 250
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    sget v0, Ly46;->warning_sub_reset:I

    .line 255
    .line 256
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    sget v0, Ly46;->yes:I

    .line 261
    .line 262
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v12

    .line 266
    sget v0, Ly46;->no:I

    .line 267
    .line 268
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    new-instance v15, La23;

    .line 273
    .line 274
    const/4 v0, 0x7

    .line 275
    invoke-direct {v15, v8, v1, v0}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 276
    .line 277
    .line 278
    const/16 v16, 0x0

    .line 279
    .line 280
    const/16 v17, 0x48a

    .line 281
    .line 282
    const/4 v10, 0x0

    .line 283
    const/4 v14, 0x0

    .line 284
    invoke-static/range {v8 .. v17}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :cond_c
    instance-of v0, v1, Len4;

    .line 290
    .line 291
    if-eqz v0, :cond_d

    .line 292
    .line 293
    sget v0, Ly46;->toast_success:I

    .line 294
    .line 295
    invoke-static {v8, v0}, Lpu;->Q(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_1

    .line 299
    .line 300
    :cond_d
    instance-of v0, v1, Lcn4;

    .line 301
    .line 302
    if-eqz v0, :cond_e

    .line 303
    .line 304
    sget v0, Ly46;->routing_settings_profile_name_empty:I

    .line 305
    .line 306
    invoke-static {v8, v0}, Lpu;->M(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_1

    .line 310
    .line 311
    :cond_e
    instance-of v0, v1, Ldn4;

    .line 312
    .line 313
    if-eqz v0, :cond_f

    .line 314
    .line 315
    sget v0, Ly46;->routing_import_profile_main_error:I

    .line 316
    .line 317
    invoke-static {v8, v0}, Lpu;->M(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 318
    .line 319
    .line 320
    goto :goto_1

    .line 321
    :cond_f
    instance-of v0, v1, Lbn4;

    .line 322
    .line 323
    if-eqz v0, :cond_10

    .line 324
    .line 325
    iget-object v0, v8, Lsu/happ/proxyutility/feature/main/MainActivity;->g1:Ly5;

    .line 326
    .line 327
    invoke-virtual {v0}, Ly5;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    check-cast v0, Lgw5;

    .line 332
    .line 333
    new-instance v3, Ldw5;

    .line 334
    .line 335
    check-cast v1, Lbn4;

    .line 336
    .line 337
    iget-object v4, v1, Lbn4;->a:Ljava/lang/String;

    .line 338
    .line 339
    iget-object v5, v1, Lbn4;->b:Ljava/lang/String;

    .line 340
    .line 341
    iget-boolean v6, v1, Lbn4;->c:Z

    .line 342
    .line 343
    iget-object v7, v1, Lbn4;->d:Ljava/lang/String;

    .line 344
    .line 345
    iget-object v8, v1, Lbn4;->e:Ljava/lang/String;

    .line 346
    .line 347
    const/4 v9, 0x0

    .line 348
    invoke-direct/range {v3 .. v9}, Ldw5;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lfn6;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v3}, Lgw5;->e(Lfw5;)V

    .line 352
    .line 353
    .line 354
    goto :goto_1

    .line 355
    :cond_10
    instance-of v0, v1, Lan4;

    .line 356
    .line 357
    if-eqz v0, :cond_12

    .line 358
    .line 359
    iget-object v0, v8, Lsu/happ/proxyutility/feature/main/MainActivity;->i1:Ly5;

    .line 360
    .line 361
    invoke-virtual {v0}, Ly5;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    check-cast v0, Lza3;

    .line 366
    .line 367
    check-cast v1, Lan4;

    .line 368
    .line 369
    iget-object v1, v1, Lan4;->a:Lja3;

    .line 370
    .line 371
    new-instance v3, Lsa3;

    .line 372
    .line 373
    invoke-direct {v3, v1}, Lsa3;-><init>(Lja3;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v3}, Lza3;->f(Lxa3;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 384
    .line 385
    :cond_11
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    move-object v3, v1

    .line 390
    check-cast v3, Lxm4;

    .line 391
    .line 392
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    const/16 v20, 0x0

    .line 396
    .line 397
    const v21, 0xbfff

    .line 398
    .line 399
    .line 400
    const/4 v4, 0x0

    .line 401
    const-wide/16 v5, 0x0

    .line 402
    .line 403
    const/4 v7, 0x0

    .line 404
    const/4 v8, 0x0

    .line 405
    const/4 v9, 0x0

    .line 406
    const/4 v10, 0x0

    .line 407
    const/4 v11, 0x0

    .line 408
    const/4 v12, 0x0

    .line 409
    const/4 v13, 0x0

    .line 410
    const/4 v14, 0x0

    .line 411
    const/4 v15, 0x0

    .line 412
    const/16 v16, 0x0

    .line 413
    .line 414
    const/16 v17, 0x0

    .line 415
    .line 416
    const/16 v18, 0x0

    .line 417
    .line 418
    const/16 v19, 0x1

    .line 419
    .line 420
    invoke-static/range {v3 .. v21}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    invoke-virtual {v0, v1, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-eqz v1, :cond_11

    .line 429
    .line 430
    goto :goto_1

    .line 431
    :cond_12
    invoke-static {}, Lb61;->c()V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :goto_1
    return-object v2

    .line 437
    :pswitch_0
    move-object/from16 v1, p1

    .line 438
    .line 439
    check-cast v1, Lpm4;

    .line 440
    .line 441
    sget v7, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 442
    .line 443
    iget-object v7, v1, Lpm4;->a:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2;

    .line 444
    .line 445
    instance-of v8, v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error;

    .line 446
    .line 447
    const/16 v9, 0xe

    .line 448
    .line 449
    iget-object v0, v0, Lyk4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 450
    .line 451
    const/16 v10, 0x8

    .line 452
    .line 453
    if-eqz v8, :cond_19

    .line 454
    .line 455
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 456
    .line 457
    if-eqz v1, :cond_18

    .line 458
    .line 459
    iget-object v1, v1, Lb6;->q0:Landroidx/cardview/widget/CardView;

    .line 460
    .line 461
    sget v7, Ld36;->bg_error:I

    .line 462
    .line 463
    invoke-static {v0, v7}, Lw79;->v(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 464
    .line 465
    .line 466
    move-result-object v7

    .line 467
    invoke-virtual {v1, v7}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(Landroid/content/res/ColorStateList;)V

    .line 468
    .line 469
    .line 470
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 471
    .line 472
    if-eqz v1, :cond_17

    .line 473
    .line 474
    iget-object v1, v1, Lb6;->H0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 475
    .line 476
    sget v7, Ly46;->routing_downloading_geo_files_failure:I

    .line 477
    .line 478
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 483
    .line 484
    .line 485
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 486
    .line 487
    if-eqz v1, :cond_16

    .line 488
    .line 489
    iget-object v1, v1, Lb6;->G0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 490
    .line 491
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 492
    .line 493
    .line 494
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 495
    .line 496
    if-eqz v1, :cond_15

    .line 497
    .line 498
    iget-object v1, v1, Lb6;->s0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 499
    .line 500
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 501
    .line 502
    .line 503
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 504
    .line 505
    if-eqz v1, :cond_14

    .line 506
    .line 507
    iget-object v1, v1, Lb6;->s0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 508
    .line 509
    sget v7, Lq36;->ic_error:I

    .line 510
    .line 511
    invoke-virtual {v1, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 512
    .line 513
    .line 514
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 515
    .line 516
    if-eqz v0, :cond_13

    .line 517
    .line 518
    iget-object v0, v0, Lb6;->q0:Landroidx/cardview/widget/CardView;

    .line 519
    .line 520
    invoke-static {v9, v0, v3, v5}, Lrp7;->g(ILandroid/view/View;ZZ)V

    .line 521
    .line 522
    .line 523
    goto/16 :goto_6

    .line 524
    .line 525
    :cond_13
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    throw v6

    .line 529
    :cond_14
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    throw v6

    .line 533
    :cond_15
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    throw v6

    .line 537
    :cond_16
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw v6

    .line 541
    :cond_17
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    throw v6

    .line 545
    :cond_18
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    throw v6

    .line 549
    :cond_19
    instance-of v8, v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading;

    .line 550
    .line 551
    if-eqz v8, :cond_27

    .line 552
    .line 553
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 554
    .line 555
    if-eqz v1, :cond_26

    .line 556
    .line 557
    iget-object v1, v1, Lb6;->q0:Landroidx/cardview/widget/CardView;

    .line 558
    .line 559
    sget v8, Ld36;->bg_geo_card:I

    .line 560
    .line 561
    invoke-static {v0, v8}, Lw79;->v(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    invoke-virtual {v1, v8}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(Landroid/content/res/ColorStateList;)V

    .line 566
    .line 567
    .line 568
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 569
    .line 570
    if-eqz v1, :cond_25

    .line 571
    .line 572
    iget-object v1, v1, Lb6;->H0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 573
    .line 574
    sget v8, Ly46;->routing_downloading_geo_files_progress:I

    .line 575
    .line 576
    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v8

    .line 580
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 581
    .line 582
    .line 583
    instance-of v1, v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;

    .line 584
    .line 585
    if-eqz v1, :cond_1e

    .line 586
    .line 587
    check-cast v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;

    .line 588
    .line 589
    invoke-virtual {v7}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->e()Ljava/lang/Long;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    iget-object v8, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 594
    .line 595
    if-nez v1, :cond_1b

    .line 596
    .line 597
    if-eqz v8, :cond_1a

    .line 598
    .line 599
    iget-object v1, v8, Lb6;->G0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 600
    .line 601
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 602
    .line 603
    .line 604
    goto :goto_2

    .line 605
    :cond_1a
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    throw v6

    .line 609
    :cond_1b
    if-eqz v8, :cond_1d

    .line 610
    .line 611
    iget-object v1, v8, Lb6;->G0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 612
    .line 613
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 614
    .line 615
    .line 616
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 617
    .line 618
    if-eqz v1, :cond_1c

    .line 619
    .line 620
    iget-object v1, v1, Lb6;->G0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 621
    .line 622
    sget v8, Ly46;->routing_downloading_geo_files_progress_value:I

    .line 623
    .line 624
    invoke-virtual {v7}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->d()Ljava/lang/Integer;

    .line 625
    .line 626
    .line 627
    move-result-object v10

    .line 628
    invoke-virtual {v7}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->c()J

    .line 629
    .line 630
    .line 631
    move-result-wide v11

    .line 632
    invoke-static {v11, v12}, Lx79;->g(J)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v11

    .line 636
    invoke-virtual {v7}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->e()Ljava/lang/Long;

    .line 637
    .line 638
    .line 639
    move-result-object v7

    .line 640
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 641
    .line 642
    .line 643
    move-result-wide v12

    .line 644
    invoke-static {v12, v13}, Lx79;->g(J)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v7

    .line 648
    filled-new-array {v10, v11, v7}, [Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v7

    .line 652
    invoke-virtual {v0, v8, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v7

    .line 656
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 657
    .line 658
    .line 659
    goto :goto_2

    .line 660
    :cond_1c
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    throw v6

    .line 664
    :cond_1d
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    throw v6

    .line 668
    :cond_1e
    :goto_2
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 669
    .line 670
    if-eqz v1, :cond_24

    .line 671
    .line 672
    iget-object v1, v1, Lb6;->s0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 673
    .line 674
    invoke-virtual {v1}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    if-nez v1, :cond_22

    .line 679
    .line 680
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 681
    .line 682
    if-eqz v1, :cond_21

    .line 683
    .line 684
    iget-object v1, v1, Lb6;->s0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 685
    .line 686
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 687
    .line 688
    .line 689
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 690
    .line 691
    if-eqz v1, :cond_20

    .line 692
    .line 693
    iget-object v1, v1, Lb6;->s0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 694
    .line 695
    sget v7, Lq36;->ic_loading:I

    .line 696
    .line 697
    invoke-virtual {v1, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 698
    .line 699
    .line 700
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 701
    .line 702
    if-eqz v1, :cond_1f

    .line 703
    .line 704
    iget-object v1, v1, Lb6;->s0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 705
    .line 706
    invoke-static {}, Lz91;->E()Landroid/view/animation/RotateAnimation;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    invoke-virtual {v1, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 711
    .line 712
    .line 713
    goto :goto_3

    .line 714
    :cond_1f
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    throw v6

    .line 718
    :cond_20
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    throw v6

    .line 722
    :cond_21
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    throw v6

    .line 726
    :cond_22
    :goto_3
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 727
    .line 728
    if-eqz v0, :cond_23

    .line 729
    .line 730
    iget-object v0, v0, Lb6;->q0:Landroidx/cardview/widget/CardView;

    .line 731
    .line 732
    invoke-static {v9, v0, v3, v5}, Lrp7;->g(ILandroid/view/View;ZZ)V

    .line 733
    .line 734
    .line 735
    goto/16 :goto_6

    .line 736
    .line 737
    :cond_23
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    throw v6

    .line 741
    :cond_24
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    throw v6

    .line 745
    :cond_25
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    throw v6

    .line 749
    :cond_26
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    throw v6

    .line 753
    :cond_27
    instance-of v8, v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Success;

    .line 754
    .line 755
    if-eqz v8, :cond_2f

    .line 756
    .line 757
    move-object v11, v7

    .line 758
    check-cast v11, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Success;

    .line 759
    .line 760
    invoke-virtual {v11}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Success;->c()J

    .line 761
    .line 762
    .line 763
    move-result-wide v11

    .line 764
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 765
    .line 766
    .line 767
    move-result-wide v13

    .line 768
    sub-long/2addr v13, v11

    .line 769
    const-wide/16 v11, 0x1388

    .line 770
    .line 771
    cmp-long v11, v13, v11

    .line 772
    .line 773
    if-lez v11, :cond_28

    .line 774
    .line 775
    goto :goto_4

    .line 776
    :cond_28
    iget-boolean v1, v1, Lpm4;->b:Z

    .line 777
    .line 778
    if-nez v1, :cond_2f

    .line 779
    .line 780
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 781
    .line 782
    if-eqz v1, :cond_2e

    .line 783
    .line 784
    iget-object v1, v1, Lb6;->q0:Landroidx/cardview/widget/CardView;

    .line 785
    .line 786
    sget v7, Ld36;->bg_geo_card:I

    .line 787
    .line 788
    invoke-static {v0, v7}, Lw79;->v(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 789
    .line 790
    .line 791
    move-result-object v7

    .line 792
    invoke-virtual {v1, v7}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(Landroid/content/res/ColorStateList;)V

    .line 793
    .line 794
    .line 795
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 796
    .line 797
    if-eqz v1, :cond_2d

    .line 798
    .line 799
    iget-object v1, v1, Lb6;->H0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 800
    .line 801
    sget v7, Ly46;->geo_file_download_success:I

    .line 802
    .line 803
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v7

    .line 807
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 808
    .line 809
    .line 810
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 811
    .line 812
    if-eqz v1, :cond_2c

    .line 813
    .line 814
    iget-object v1, v1, Lb6;->G0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 815
    .line 816
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 817
    .line 818
    .line 819
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 820
    .line 821
    if-eqz v1, :cond_2b

    .line 822
    .line 823
    iget-object v1, v1, Lb6;->s0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 824
    .line 825
    invoke-static {v1}, Loc;->g(Landroid/view/View;)V

    .line 826
    .line 827
    .line 828
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 829
    .line 830
    if-eqz v1, :cond_2a

    .line 831
    .line 832
    iget-object v1, v1, Lb6;->s0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 833
    .line 834
    sget v7, Lq36;->ic_success:I

    .line 835
    .line 836
    invoke-virtual {v1, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 837
    .line 838
    .line 839
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 840
    .line 841
    if-eqz v0, :cond_29

    .line 842
    .line 843
    iget-object v0, v0, Lb6;->q0:Landroidx/cardview/widget/CardView;

    .line 844
    .line 845
    invoke-static {v9, v0, v3, v5}, Lrp7;->g(ILandroid/view/View;ZZ)V

    .line 846
    .line 847
    .line 848
    goto :goto_6

    .line 849
    :cond_29
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    throw v6

    .line 853
    :cond_2a
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    throw v6

    .line 857
    :cond_2b
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    throw v6

    .line 861
    :cond_2c
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    throw v6

    .line 865
    :cond_2d
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    throw v6

    .line 869
    :cond_2e
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    throw v6

    .line 873
    :cond_2f
    :goto_4
    if-nez v8, :cond_31

    .line 874
    .line 875
    if-nez v7, :cond_30

    .line 876
    .line 877
    goto :goto_5

    .line 878
    :cond_30
    invoke-static {}, Lb61;->c()V

    .line 879
    .line 880
    .line 881
    move-object v2, v6

    .line 882
    goto :goto_6

    .line 883
    :cond_31
    :goto_5
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 884
    .line 885
    if-eqz v1, :cond_34

    .line 886
    .line 887
    iget-object v1, v1, Lb6;->q0:Landroidx/cardview/widget/CardView;

    .line 888
    .line 889
    invoke-static {v9, v1, v5, v5}, Lrp7;->g(ILandroid/view/View;ZZ)V

    .line 890
    .line 891
    .line 892
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 893
    .line 894
    if-eqz v1, :cond_33

    .line 895
    .line 896
    iget-object v1, v1, Lb6;->G0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 897
    .line 898
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 899
    .line 900
    .line 901
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 902
    .line 903
    if-eqz v0, :cond_32

    .line 904
    .line 905
    iget-object v0, v0, Lb6;->s0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 906
    .line 907
    invoke-static {v0}, Loc;->g(Landroid/view/View;)V

    .line 908
    .line 909
    .line 910
    :goto_6
    return-object v2

    .line 911
    :cond_32
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    throw v6

    .line 915
    :cond_33
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    throw v6

    .line 919
    :cond_34
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    throw v6

    .line 923
    :pswitch_1
    move-object/from16 v1, p1

    .line 924
    .line 925
    check-cast v1, Ljava/lang/String;

    .line 926
    .line 927
    move-object/from16 v2, p2

    .line 928
    .line 929
    invoke-virtual {v0, v1, v2}, Lyk4;->a(Ljava/lang/String;Lq51;)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    return-object v0

    .line 934
    nop

    .line 935
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
