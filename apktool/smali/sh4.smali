.class public final synthetic Lsh4;
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
    iput-byte p1, p0, Lsh4;->X:B

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
    .locals 1

    .line 1
    iget-byte p0, p0, Lsh4;->X:B

    .line 2
    .line 3
    const-string v0, "MAIN"

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p0, Lyw2;->c:Lcom/google/gson/a;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 12
    .line 13
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->g()Lgk7;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_1
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 23
    .line 24
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_2
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 34
    .line 35
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_3
    const-string p0, "SUB_PROPERTIES"

    .line 45
    .line 46
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_4
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {v0, p0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :pswitch_5
    sget-object p0, Lky4;->a:Lky4;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_6
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_7
    new-instance p0, Lyz4;

    .line 71
    .line 72
    invoke-direct {p0}, Lqc4;-><init>()V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_8
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 77
    .line 78
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_9
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 88
    .line 89
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->K0:Lvz7;

    .line 94
    .line 95
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Lmq0;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_a
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {v0, p0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_b
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 112
    .line 113
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :pswitch_c
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 123
    .line 124
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->D0:Lvz7;

    .line 129
    .line 130
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Lun5;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_d
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 138
    .line 139
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->o0:Lvz7;

    .line 144
    .line 145
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    check-cast p0, Lxj7;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_e
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 153
    .line 154
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->i()Lig8;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_f
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 164
    .line 165
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->r0:Lvz7;

    .line 170
    .line 171
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    check-cast p0, Lpv0;

    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_10
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 179
    .line 180
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->c()Lqc2;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :pswitch_11
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 190
    .line 191
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->k0:Lvz7;

    .line 196
    .line 197
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Ls24;

    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_12
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 205
    .line 206
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->j0:Lvz7;

    .line 211
    .line 212
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    check-cast p0, Lqq0;

    .line 217
    .line 218
    return-object p0

    .line 219
    :pswitch_13
    sget-object p0, Lkw4;->a:Lkw4;

    .line 220
    .line 221
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_14
    new-instance p0, Lyz4;

    .line 227
    .line 228
    invoke-direct {p0}, Lqc4;-><init>()V

    .line 229
    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_15
    sget-object p0, Ldn8;->a:Ldn8;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_16
    sget p0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 236
    .line 237
    sget-object p0, Lkw4;->a:Lkw4;

    .line 238
    .line 239
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :pswitch_17
    sget p0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 245
    .line 246
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-static {v0, p0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    return-object p0

    .line 255
    :pswitch_18
    sget p0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 256
    .line 257
    new-instance p0, Landroid/net/NetworkRequest$Builder;

    .line 258
    .line 259
    invoke-direct {p0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 260
    .line 261
    .line 262
    const/16 v0, 0xc

    .line 263
    .line 264
    invoke-virtual {p0, v0}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    const/16 v0, 0xd

    .line 269
    .line 270
    invoke-virtual {p0, v0}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-virtual {p0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    return-object p0

    .line 279
    :pswitch_19
    sget p0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 280
    .line 281
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 282
    .line 283
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->G0:Lvz7;

    .line 288
    .line 289
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    check-cast p0, Lpr7;

    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_1a
    sget-object p0, Lkw4;->a:Lkw4;

    .line 297
    .line 298
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    return-object p0

    .line 303
    :pswitch_1b
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 304
    .line 305
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    return-object p0

    .line 314
    :pswitch_1c
    sget-object p0, Lkw4;->a:Lkw4;

    .line 315
    .line 316
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    return-object p0

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
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
