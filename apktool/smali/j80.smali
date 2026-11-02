.class public final synthetic Lj80;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lj80;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lj80;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lj80;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lj80;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lj80;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lj80;->h0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p6, p0, Lj80;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lj80;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object v3, v0, Lj80;->i0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lj80;->h0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lj80;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lj80;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Lj80;->Z:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, v0, Lj80;->Y:Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object v10, v0

    .line 24
    check-cast v10, Lsf4;

    .line 25
    .line 26
    check-cast v7, Lpv3;

    .line 27
    .line 28
    check-cast v6, Loh2;

    .line 29
    .line 30
    check-cast v5, Loh2;

    .line 31
    .line 32
    move-object v15, v4

    .line 33
    check-cast v15, Loh2;

    .line 34
    .line 35
    move-object v12, v3

    .line 36
    check-cast v12, Lcm5;

    .line 37
    .line 38
    move-object/from16 v0, p1

    .line 39
    .line 40
    check-cast v0, Ly64;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-object v13, v7

    .line 46
    check-cast v13, Lgn2;

    .line 47
    .line 48
    new-instance v1, Lo90;

    .line 49
    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    invoke-direct {v1, v10, v13, v3}, Lo90;-><init>(Ljava/lang/Object;Lgn2;B)V

    .line 53
    .line 54
    .line 55
    new-instance v3, Lzy0;

    .line 56
    .line 57
    const v4, -0x451216a4

    .line 58
    .line 59
    .line 60
    const/4 v7, 0x1

    .line 61
    invoke-direct {v3, v4, v7, v1}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const-string v1, "LogSettingsBlock"

    .line 65
    .line 66
    invoke-static {v0, v1, v3}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 67
    .line 68
    .line 69
    const-string v1, "LogSettingsBlockSpacer"

    .line 70
    .line 71
    sget-object v3, Lw51;->e:Lzy0;

    .line 72
    .line 73
    invoke-static {v0, v1, v3}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 74
    .line 75
    .line 76
    const-string v1, "LogFilesLabel"

    .line 77
    .line 78
    sget-object v3, Lw51;->f:Lzy0;

    .line 79
    .line 80
    invoke-static {v0, v1, v3}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v10, Lsf4;->c:Llf4;

    .line 84
    .line 85
    iget-object v3, v10, Lsf4;->f:Lj2;

    .line 86
    .line 87
    if-eqz v1, :cond_0

    .line 88
    .line 89
    new-instance v4, Lrh4;

    .line 90
    .line 91
    invoke-direct {v4, v1, v6, v13, v8}, Lrh4;-><init>(Llf4;Loh2;Lgn2;B)V

    .line 92
    .line 93
    .line 94
    new-instance v1, Lzy0;

    .line 95
    .line 96
    const v9, 0x763c7388

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, v9, v7, v4}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const-string v4, "AccessLogFileItem"

    .line 103
    .line 104
    invoke-static {v0, v4, v1}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 105
    .line 106
    .line 107
    const-string v1, "AccessLogFileItemSpacer"

    .line 108
    .line 109
    sget-object v4, Lw51;->g:Lzy0;

    .line 110
    .line 111
    invoke-static {v0, v1, v4}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 112
    .line 113
    .line 114
    :cond_0
    iget-object v1, v10, Lsf4;->d:Llf4;

    .line 115
    .line 116
    if-eqz v1, :cond_1

    .line 117
    .line 118
    new-instance v4, Lrh4;

    .line 119
    .line 120
    invoke-direct {v4, v1, v5, v13, v7}, Lrh4;-><init>(Llf4;Loh2;Lgn2;B)V

    .line 121
    .line 122
    .line 123
    new-instance v1, Lzy0;

    .line 124
    .line 125
    const v9, 0x6744ed7f

    .line 126
    .line 127
    .line 128
    invoke-direct {v1, v9, v7, v4}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    const-string v4, "SubscriptionLogFileItem"

    .line 132
    .line 133
    invoke-static {v0, v4, v1}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 134
    .line 135
    .line 136
    const-string v1, "SubscriptionLogFileItemSpacer"

    .line 137
    .line 138
    sget-object v4, Lw51;->h:Lzy0;

    .line 139
    .line 140
    invoke-static {v0, v1, v4}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 141
    .line 142
    .line 143
    :cond_1
    iget-object v1, v10, Lsf4;->e:Llf4;

    .line 144
    .line 145
    if-eqz v1, :cond_2

    .line 146
    .line 147
    new-instance v4, Lrh4;

    .line 148
    .line 149
    const/4 v9, 0x2

    .line 150
    invoke-direct {v4, v1, v15, v13, v9}, Lrh4;-><init>(Llf4;Loh2;Lgn2;B)V

    .line 151
    .line 152
    .line 153
    new-instance v1, Lzy0;

    .line 154
    .line 155
    const v9, -0x4df09e40

    .line 156
    .line 157
    .line 158
    invoke-direct {v1, v9, v7, v4}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    const-string v4, "PushLogFileItem"

    .line 162
    .line 163
    invoke-static {v0, v4, v1}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 164
    .line 165
    .line 166
    :cond_2
    const-string v1, "XrayFilesLabel"

    .line 167
    .line 168
    sget-object v4, Lw51;->i:Lzy0;

    .line 169
    .line 170
    invoke-static {v0, v1, v4}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v8}, Lz1;->listIterator(I)Ljava/util/ListIterator;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    :goto_0
    move v14, v8

    .line 178
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_5

    .line 183
    .line 184
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    add-int/lit8 v8, v14, 0x1

    .line 189
    .line 190
    if-ltz v14, :cond_4

    .line 191
    .line 192
    move-object v11, v4

    .line 193
    check-cast v11, Llf4;

    .line 194
    .line 195
    iget-object v4, v11, Llf4;->b:Ljava/lang/String;

    .line 196
    .line 197
    new-instance v9, Lph4;

    .line 198
    .line 199
    move-object/from16 v16, v5

    .line 200
    .line 201
    move-object/from16 v17, v6

    .line 202
    .line 203
    invoke-direct/range {v9 .. v17}, Lph4;-><init>(Lsf4;Llf4;Lcm5;Lgn2;ILoh2;Loh2;Loh2;)V

    .line 204
    .line 205
    .line 206
    new-instance v5, Lzy0;

    .line 207
    .line 208
    const v6, -0x211e9c4a

    .line 209
    .line 210
    .line 211
    invoke-direct {v5, v6, v7, v9}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v0, v4, v5}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Lz0;->size()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    sub-int/2addr v4, v7

    .line 222
    if-eq v14, v4, :cond_3

    .line 223
    .line 224
    iget-object v4, v11, Llf4;->b:Ljava/lang/String;

    .line 225
    .line 226
    const-string v5, "Spacer"

    .line 227
    .line 228
    invoke-static {v5, v4}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    sget-object v5, Lw51;->j:Lzy0;

    .line 233
    .line 234
    invoke-static {v0, v4, v5}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 235
    .line 236
    .line 237
    :cond_3
    move-object/from16 v5, v16

    .line 238
    .line 239
    move-object/from16 v6, v17

    .line 240
    .line 241
    goto :goto_0

    .line 242
    :cond_4
    invoke-static {}, Li21;->X()V

    .line 243
    .line 244
    .line 245
    const/4 v0, 0x0

    .line 246
    throw v0

    .line 247
    :cond_5
    const-string v1, "LogFilesBlockBottomSpacer"

    .line 248
    .line 249
    sget-object v3, Lw51;->k:Lzy0;

    .line 250
    .line 251
    invoke-static {v0, v1, v3}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 252
    .line 253
    .line 254
    return-object v2

    .line 255
    :pswitch_0
    check-cast v0, [Leo5;

    .line 256
    .line 257
    check-cast v7, Ljava/util/List;

    .line 258
    .line 259
    check-cast v6, Lzr4;

    .line 260
    .line 261
    check-cast v5, Lca6;

    .line 262
    .line 263
    check-cast v4, Lca6;

    .line 264
    .line 265
    check-cast v3, Lk80;

    .line 266
    .line 267
    move-object/from16 v9, p1

    .line 268
    .line 269
    check-cast v9, Ldo5;

    .line 270
    .line 271
    array-length v1, v0

    .line 272
    move v10, v8

    .line 273
    :goto_1
    if-ge v8, v1, :cond_6

    .line 274
    .line 275
    aget-object v11, v0, v8

    .line 276
    .line 277
    add-int/lit8 v16, v10, 0x1

    .line 278
    .line 279
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v10

    .line 286
    check-cast v10, Ltr4;

    .line 287
    .line 288
    invoke-interface {v6}, Lug3;->getLayoutDirection()Lz24;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    iget v13, v5, Lca6;->X:I

    .line 293
    .line 294
    iget v14, v4, Lca6;->X:I

    .line 295
    .line 296
    iget-object v15, v3, Lk80;->a:Lp50;

    .line 297
    .line 298
    move-object/from16 v18, v11

    .line 299
    .line 300
    move-object v11, v10

    .line 301
    move-object/from16 v10, v18

    .line 302
    .line 303
    invoke-static/range {v9 .. v15}, Lg80;->d(Ldo5;Leo5;Ltr4;Lz24;IILp50;)V

    .line 304
    .line 305
    .line 306
    add-int/lit8 v8, v8, 0x1

    .line 307
    .line 308
    move/from16 v10, v16

    .line 309
    .line 310
    goto :goto_1

    .line 311
    :cond_6
    return-object v2

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
