.class public final synthetic Ldw4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 9
    iput-byte p1, p0, Ldw4;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk85;)V
    .locals 0

    .line 1
    const/16 p1, 0xc

    .line 2
    .line 3
    iput-byte p1, p0, Ldw4;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte p0, p0, Ldw4;->X:B

    .line 2
    .line 3
    const-string v0, "Blank serial names are prohibited"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "SETTING"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lokhttp3/internal/dns/RealDnsCache;->a()Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    sget-object p0, Lkw4;->a:Lkw4;

    .line 18
    .line 19
    sget-object p0, Lkw4;->d:Lvz7;

    .line 20
    .line 21
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    sget-object p0, Lkw4;->a:Lkw4;

    .line 29
    .line 30
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_2
    sget-object p0, Lkw4;->a:Lkw4;

    .line 36
    .line 37
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_3
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 43
    .line 44
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_4
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 54
    .line 55
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :pswitch_5
    return-object v3

    .line 65
    :pswitch_6
    sget-object p0, Ltp1;->a:Lnf1;

    .line 66
    .line 67
    sget-object p0, Lye1;->Z:Lye1;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_7
    return-object v3

    .line 71
    :pswitch_8
    sget p0, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;->U0:I

    .line 72
    .line 73
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {v2, p0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_9
    sget-object p0, Ldn8;->a:Ldn8;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_a
    sget-object p0, Lkw4;->a:Lkw4;

    .line 86
    .line 87
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :pswitch_b
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 93
    .line 94
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->i()Lig8;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_c
    new-instance p0, Lmf;

    .line 104
    .line 105
    new-instance v0, Landroid/graphics/PathMeasure;

    .line 106
    .line 107
    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, v0}, Lmf;-><init>(Landroid/graphics/PathMeasure;)V

    .line 111
    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_d
    new-instance p0, Lif5;

    .line 115
    .line 116
    invoke-direct {p0}, Lif5;-><init>()V

    .line 117
    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_e
    sget-object p0, Lkw4;->a:Lkw4;

    .line 121
    .line 122
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :pswitch_f
    new-instance p0, Lokhttp3/OkHttpClient;

    .line 128
    .line 129
    invoke-direct {p0}, Lokhttp3/OkHttpClient;-><init>()V

    .line 130
    .line 131
    .line 132
    new-instance v0, Lgd0;

    .line 133
    .line 134
    invoke-direct {v0, p0}, Lgd0;-><init>(Lokhttp3/OkHttpClient;)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_10
    move-object p0, v3

    .line 139
    sget-object v3, Lpm7;->P:Lpm7;

    .line 140
    .line 141
    new-array v2, v1, [Le37;

    .line 142
    .line 143
    move-object v4, v2

    .line 144
    const-string v2, "kotlin.Unit"

    .line 145
    .line 146
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-nez v5, :cond_2

    .line 151
    .line 152
    sget-object v0, Lpm7;->M:Lpm7;

    .line 153
    .line 154
    if-eq v3, v0, :cond_0

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_0
    const/4 v1, 0x1

    .line 158
    :goto_0
    if-nez v1, :cond_1

    .line 159
    .line 160
    new-instance v6, Ldt0;

    .line 161
    .line 162
    invoke-direct {v6, v2}, Ldt0;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    new-instance v1, Lg37;

    .line 166
    .line 167
    iget-object p0, v6, Ldt0;->b:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    invoke-static {v4}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    move v4, p0

    .line 178
    invoke-direct/range {v1 .. v6}, Lg37;-><init>(Ljava/lang/String;Lnr4;ILjava/util/List;Ldt0;)V

    .line 179
    .line 180
    .line 181
    move-object v3, v1

    .line 182
    goto :goto_2

    .line 183
    :cond_1
    const-string v0, "For StructureKind.CLASS please use \'buildClassSerialDescriptor\' instead"

    .line 184
    .line 185
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    :goto_1
    move-object v3, p0

    .line 189
    goto :goto_2

    .line 190
    :cond_2
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :goto_2
    return-object v3

    .line 195
    :pswitch_11
    sget-object p0, Lwl8;->a:Lwl8;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_12
    sget-object p0, Lnc0;->a:Lfe1;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_13
    move-object p0, v3

    .line 202
    sget-object v0, Lb02;->X:Lb02;

    .line 203
    .line 204
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0, p0}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 209
    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_14
    move-object p0, v3

    .line 213
    new-array v1, v1, [Le37;

    .line 214
    .line 215
    const-string v3, "kotlinx.datetime.MonthBased"

    .line 216
    .line 217
    invoke-static {v3}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-nez v2, :cond_3

    .line 222
    .line 223
    new-instance v7, Ldt0;

    .line 224
    .line 225
    invoke-direct {v7, v3}, Ldt0;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    sget-object p0, Lnf3;->a:Lnf3;

    .line 229
    .line 230
    sget-object p0, Lnf3;->b:Lbu5;

    .line 231
    .line 232
    const-string v0, "months"

    .line 233
    .line 234
    invoke-virtual {v7, v0, p0}, Ldt0;->a(Ljava/lang/String;Le37;)V

    .line 235
    .line 236
    .line 237
    new-instance v2, Lg37;

    .line 238
    .line 239
    sget-object v4, Lpm7;->M:Lpm7;

    .line 240
    .line 241
    iget-object p0, v7, Ldt0;->b:Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    invoke-static {v1}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-direct/range {v2 .. v7}, Lg37;-><init>(Ljava/lang/String;Lnr4;ILjava/util/List;Ldt0;)V

    .line 252
    .line 253
    .line 254
    move-object v3, v2

    .line 255
    goto :goto_3

    .line 256
    :cond_3
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    move-object v3, p0

    .line 260
    :goto_3
    return-object v3

    .line 261
    :pswitch_15
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    return-object p0

    .line 266
    :pswitch_16
    const-string p0, "SUB_ROUTING_ENABLED"

    .line 267
    .line 268
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    return-object p0

    .line 277
    :pswitch_17
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-static {v2, p0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    return-object p0

    .line 286
    :pswitch_18
    const-string p0, "SUB"

    .line 287
    .line 288
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    return-object p0

    .line 297
    :pswitch_19
    const-string p0, "SERVER_AFF"

    .line 298
    .line 299
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    return-object p0

    .line 308
    :pswitch_1a
    const-string p0, "SERVER_RAW"

    .line 309
    .line 310
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    return-object p0

    .line 319
    :pswitch_1b
    const-string p0, "SERVER_CONFIG"

    .line 320
    .line 321
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    return-object p0

    .line 330
    :pswitch_1c
    new-instance p0, Luh3;

    .line 331
    .line 332
    const/16 v0, 0x1b

    .line 333
    .line 334
    invoke-direct {p0, v0}, Luh3;-><init>(B)V

    .line 335
    .line 336
    .line 337
    invoke-static {p0}, Lw51;->c(Lgn2;)Lcp3;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    return-object p0

    .line 342
    nop

    .line 343
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
