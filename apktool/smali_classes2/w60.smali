.class public final synthetic Lw60;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lw60;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 98

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, Lw60;->X:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const-string v0, "LocalFontLoader"

    .line 10
    .line 11
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw v1

    .line 15
    :pswitch_0
    const-string v0, "LocalFocusManager"

    .line 16
    .line 17
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v1

    .line 21
    :pswitch_1
    const-string v0, "LocalDensity"

    .line 22
    .line 23
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v1

    .line 27
    :pswitch_2
    const-string v0, "LocalFontFamilyResolver"

    .line 28
    .line 29
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :pswitch_3
    const-string v0, "LocalGraphicsContext"

    .line 34
    .line 35
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :pswitch_4
    const-string v0, "LocalClipboard"

    .line 40
    .line 41
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :pswitch_5
    const-string v0, "LocalClipboardManager"

    .line 46
    .line 47
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :pswitch_6
    const-string v0, "LocalAutofillManager"

    .line 52
    .line 53
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :pswitch_7
    const-string v0, "LocalAutofillTree"

    .line 58
    .line 59
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :pswitch_8
    return-object v1

    .line 64
    :pswitch_9
    new-instance v0, Lx01;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_a
    const-string v0, "LocalWindowInfo"

    .line 71
    .line 72
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :pswitch_b
    const-string v0, "LocalViewConfiguration"

    .line 77
    .line 78
    invoke-static {v0}, Ly01;->b(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v1

    .line 82
    :pswitch_c
    return-object v1

    .line 83
    :pswitch_d
    sget-object v0, Ldn8;->a:Ldn8;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_e
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_f
    sget-wide v2, Lew0;->z:J

    .line 90
    .line 91
    sget-wide v4, Lew0;->j:J

    .line 92
    .line 93
    sget-wide v6, Lew0;->A:J

    .line 94
    .line 95
    sget-wide v8, Lew0;->k:J

    .line 96
    .line 97
    sget-wide v10, Lew0;->e:J

    .line 98
    .line 99
    sget-wide v12, Lew0;->E:J

    .line 100
    .line 101
    sget-wide v14, Lew0;->n:J

    .line 102
    .line 103
    sget-wide v16, Lew0;->F:J

    .line 104
    .line 105
    sget-wide v18, Lew0;->o:J

    .line 106
    .line 107
    sget-wide v20, Lew0;->R:J

    .line 108
    .line 109
    sget-wide v22, Lew0;->t:J

    .line 110
    .line 111
    sget-wide v24, Lew0;->S:J

    .line 112
    .line 113
    sget-wide v26, Lew0;->u:J

    .line 114
    .line 115
    sget-wide v28, Lew0;->a:J

    .line 116
    .line 117
    sget-wide v30, Lew0;->g:J

    .line 118
    .line 119
    sget-wide v32, Lew0;->I:J

    .line 120
    .line 121
    sget-wide v34, Lew0;->r:J

    .line 122
    .line 123
    sget-wide v36, Lew0;->Q:J

    .line 124
    .line 125
    sget-wide v38, Lew0;->s:J

    .line 126
    .line 127
    sget-wide v42, Lew0;->f:J

    .line 128
    .line 129
    sget-wide v44, Lew0;->d:J

    .line 130
    .line 131
    sget-wide v46, Lew0;->b:J

    .line 132
    .line 133
    sget-wide v48, Lew0;->h:J

    .line 134
    .line 135
    sget-wide v50, Lew0;->c:J

    .line 136
    .line 137
    sget-wide v52, Lew0;->i:J

    .line 138
    .line 139
    sget-wide v54, Lew0;->x:J

    .line 140
    .line 141
    sget-wide v56, Lew0;->y:J

    .line 142
    .line 143
    sget-wide v58, Lew0;->D:J

    .line 144
    .line 145
    sget-wide v60, Lew0;->J:J

    .line 146
    .line 147
    sget-wide v64, Lew0;->K:J

    .line 148
    .line 149
    sget-wide v66, Lew0;->L:J

    .line 150
    .line 151
    sget-wide v68, Lew0;->M:J

    .line 152
    .line 153
    sget-wide v70, Lew0;->N:J

    .line 154
    .line 155
    sget-wide v72, Lew0;->O:J

    .line 156
    .line 157
    sget-wide v62, Lew0;->P:J

    .line 158
    .line 159
    sget-wide v74, Lew0;->B:J

    .line 160
    .line 161
    sget-wide v76, Lew0;->C:J

    .line 162
    .line 163
    sget-wide v78, Lew0;->l:J

    .line 164
    .line 165
    sget-wide v80, Lew0;->m:J

    .line 166
    .line 167
    sget-wide v82, Lew0;->G:J

    .line 168
    .line 169
    sget-wide v84, Lew0;->H:J

    .line 170
    .line 171
    sget-wide v86, Lew0;->p:J

    .line 172
    .line 173
    sget-wide v88, Lew0;->q:J

    .line 174
    .line 175
    sget-wide v90, Lew0;->T:J

    .line 176
    .line 177
    sget-wide v92, Lew0;->U:J

    .line 178
    .line 179
    sget-wide v94, Lew0;->v:J

    .line 180
    .line 181
    sget-wide v96, Lew0;->w:J

    .line 182
    .line 183
    new-instance v1, Liw0;

    .line 184
    .line 185
    move-wide/from16 v40, v2

    .line 186
    .line 187
    invoke-direct/range {v1 .. v97}, Liw0;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)V

    .line 188
    .line 189
    .line 190
    return-object v1

    .line 191
    :pswitch_10
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 192
    .line 193
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    return-object v0

    .line 202
    :pswitch_11
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 203
    .line 204
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->x0:Lvz7;

    .line 209
    .line 210
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Lvr1;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_12
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 218
    .line 219
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->a()Lqo;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    return-object v0

    .line 228
    :pswitch_13
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 229
    .line 230
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->w0:Lvz7;

    .line 235
    .line 236
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    check-cast v0, Lp72;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_14
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 244
    .line 245
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->x0:Lvz7;

    .line 250
    .line 251
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, Lvr1;

    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_15
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 259
    .line 260
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->a()Lqo;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    return-object v0

    .line 269
    :pswitch_16
    new-instance v0, Lar0;

    .line 270
    .line 271
    invoke-direct {v0}, Lar0;-><init>()V

    .line 272
    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_17
    new-instance v0, Ltq0;

    .line 276
    .line 277
    invoke-direct {v0}, Ltq0;-><init>()V

    .line 278
    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_18
    new-instance v0, Lqc6;

    .line 282
    .line 283
    invoke-direct {v0}, Landroid/hardware/camera2/CameraCaptureSession;-><init>()V

    .line 284
    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_19
    sget v0, Lsu/happ/proxyutility/receiver/BootUpReceiver;->c:I

    .line 288
    .line 289
    const-string v0, "MAIN"

    .line 290
    .line 291
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-static {v0, v1}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    return-object v0

    .line 300
    :pswitch_1a
    sget v0, Lsu/happ/proxyutility/receiver/BootUpReceiver;->c:I

    .line 301
    .line 302
    const-string v0, "SETTING"

    .line 303
    .line 304
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v0, v1}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    return-object v0

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
