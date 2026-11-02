.class public final synthetic Lmx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lev2;Lda6;Lda6;Lr68;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lmx2;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lmx2;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lmx2;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lmx2;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p3, p0, Lmx2;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean p5, p0, Lmx2;->Y:Z

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lox2;ZLdn2;Lkx4;Lig5;I)V
    .locals 0

    .line 18
    const/4 p6, 0x0

    iput-byte p6, p0, Lmx2;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmx2;->Z:Ljava/lang/Object;

    iput-boolean p2, p0, Lmx2;->Y:Z

    iput-object p3, p0, Lmx2;->f0:Ljava/lang/Object;

    iput-object p4, p0, Lmx2;->g0:Ljava/lang/Object;

    iput-object p5, p0, Lmx2;->h0:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lsu/happ/proxyutility/dto/SubscriptionItem;Lsu/happ/proxyutility/dto/ServerConfig;Lh69;ZLandroid/os/ParcelFileDescriptor;)V
    .locals 1

    .line 19
    const/4 v0, 0x2

    iput-byte v0, p0, Lmx2;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmx2;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lmx2;->f0:Ljava/lang/Object;

    iput-object p3, p0, Lmx2;->g0:Ljava/lang/Object;

    iput-boolean p4, p0, Lmx2;->Y:Z

    iput-object p5, p0, Lmx2;->h0:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lmx2;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object v3, v0, Lmx2;->h0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lmx2;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lmx2;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lmx2;->Z:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 19
    .line 20
    move-object v10, v5

    .line 21
    check-cast v10, Lsu/happ/proxyutility/dto/ServerConfig;

    .line 22
    .line 23
    move-object v11, v4

    .line 24
    check-cast v11, Lh69;

    .line 25
    .line 26
    move-object v13, v3

    .line 27
    check-cast v13, Landroid/os/ParcelFileDescriptor;

    .line 28
    .line 29
    move-object/from16 v8, p1

    .line 30
    .line 31
    check-cast v8, Ljava/lang/String;

    .line 32
    .line 33
    move-object/from16 v9, p2

    .line 34
    .line 35
    check-cast v9, Ljava/lang/String;

    .line 36
    .line 37
    sget-object v1, Ln69;->a:Llibxray/XRayPoint;

    .line 38
    .line 39
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v3, Lc68;

    .line 43
    .line 44
    const/4 v4, 0x7

    .line 45
    invoke-direct {v3, v4}, Lc68;-><init>(B)V

    .line 46
    .line 47
    .line 48
    sput-object v3, Ln69;->i:Lrn2;

    .line 49
    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->G()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x1

    .line 57
    if-ne v3, v4, :cond_0

    .line 58
    .line 59
    invoke-static {}, Llibxray/Libxray;->disableWrapperLogs()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Llibxray/XRayPoint;->getLogWriter()Llibxray/ConsoleLogWriter;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Llibxray/ConsoleLogWriter;->disable()V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-static {}, Llibxray/Libxray;->enableWrapperLogs()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Llibxray/XRayPoint;->getLogWriter()Llibxray/ConsoleLogWriter;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Llibxray/ConsoleLogWriter;->enable()V

    .line 78
    .line 79
    .line 80
    :goto_0
    sget-object v1, Ln69;->b:Lm51;

    .line 81
    .line 82
    sget-object v3, Ltp1;->a:Lnf1;

    .line 83
    .line 84
    sget-object v3, Ldm4;->a:Lhv2;

    .line 85
    .line 86
    new-instance v7, Lm69;

    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    iget-boolean v12, v0, Lmx2;->Y:Z

    .line 90
    .line 91
    invoke-direct/range {v7 .. v14}, Lm69;-><init>(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/ServerConfig;Lh69;ZLandroid/os/ParcelFileDescriptor;Lq51;)V

    .line 92
    .line 93
    .line 94
    const/4 v0, 0x2

    .line 95
    invoke-static {v1, v3, v7, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 96
    .line 97
    .line 98
    return-object v2

    .line 99
    :pswitch_0
    check-cast v6, Lda6;

    .line 100
    .line 101
    move-object v7, v5

    .line 102
    check-cast v7, Lr68;

    .line 103
    .line 104
    check-cast v4, Lev2;

    .line 105
    .line 106
    check-cast v3, Lda6;

    .line 107
    .line 108
    move-object/from16 v1, p1

    .line 109
    .line 110
    check-cast v1, Lhq5;

    .line 111
    .line 112
    move-object/from16 v1, p2

    .line 113
    .line 114
    check-cast v1, Lz85;

    .line 115
    .line 116
    iget-wide v8, v6, Lda6;->X:J

    .line 117
    .line 118
    iget-wide v10, v1, Lz85;->a:J

    .line 119
    .line 120
    invoke-static {v8, v9, v10, v11}, Lz85;->f(JJ)J

    .line 121
    .line 122
    .line 123
    move-result-wide v8

    .line 124
    iput-wide v8, v6, Lda6;->X:J

    .line 125
    .line 126
    iget-object v1, v7, Lr68;->b:Ly78;

    .line 127
    .line 128
    iget-object v5, v7, Lr68;->a:Lkd8;

    .line 129
    .line 130
    invoke-virtual {v1}, Ly78;->c()Lx78;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-nez v1, :cond_1

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_1
    iget-object v1, v1, Lx78;->b:Lbz4;

    .line 138
    .line 139
    iget-wide v8, v3, Lda6;->X:J

    .line 140
    .line 141
    iget-wide v10, v6, Lda6;->X:J

    .line 142
    .line 143
    invoke-static {v8, v9, v10, v11}, Lz85;->f(JJ)J

    .line 144
    .line 145
    .line 146
    move-result-wide v8

    .line 147
    invoke-virtual {v7, v4, v8, v9}, Lr68;->B(Lev2;J)V

    .line 148
    .line 149
    .line 150
    iget-boolean v11, v0, Lmx2;->Y:Z

    .line 151
    .line 152
    if-eqz v11, :cond_2

    .line 153
    .line 154
    invoke-virtual {v7}, Lr68;->n()J

    .line 155
    .line 156
    .line 157
    move-result-wide v3

    .line 158
    invoke-virtual {v1, v3, v4}, Lbz4;->f(J)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    :goto_1
    move v9, v0

    .line 163
    goto :goto_2

    .line 164
    :cond_2
    invoke-virtual {v5}, Lkd8;->d()Lh48;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget-wide v3, v0, Lh48;->f0:J

    .line 169
    .line 170
    sget v0, Lf88;->c:I

    .line 171
    .line 172
    const/16 v0, 0x20

    .line 173
    .line 174
    shr-long/2addr v3, v0

    .line 175
    long-to-int v0, v3

    .line 176
    goto :goto_1

    .line 177
    :goto_2
    if-eqz v11, :cond_3

    .line 178
    .line 179
    invoke-virtual {v5}, Lkd8;->d()Lh48;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-wide v0, v0, Lh48;->f0:J

    .line 184
    .line 185
    sget v3, Lf88;->c:I

    .line 186
    .line 187
    const-wide v3, 0xffffffffL

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    and-long/2addr v0, v3

    .line 193
    long-to-int v0, v0

    .line 194
    :goto_3
    move v10, v0

    .line 195
    goto :goto_4

    .line 196
    :cond_3
    invoke-virtual {v7}, Lr68;->n()J

    .line 197
    .line 198
    .line 199
    move-result-wide v3

    .line 200
    invoke-virtual {v1, v3, v4}, Lbz4;->f(J)I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    goto :goto_3

    .line 205
    :goto_4
    invoke-virtual {v5}, Lkd8;->d()Lh48;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    iget-wide v0, v0, Lh48;->f0:J

    .line 210
    .line 211
    invoke-virtual {v5}, Lkd8;->d()Lh48;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    sget-object v12, Llh4;->D0:Lkp5;

    .line 216
    .line 217
    new-instance v15, Lfz2;

    .line 218
    .line 219
    const/16 v3, 0x9

    .line 220
    .line 221
    invoke-direct {v15, v3}, Lfz2;-><init>(I)V

    .line 222
    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    invoke-virtual/range {v7 .. v15}, Lr68;->C(Lh48;IIZLkp5;ZZLfz2;)J

    .line 227
    .line 228
    .line 229
    move-result-wide v3

    .line 230
    invoke-static {v0, v1}, Lf88;->b(J)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_4

    .line 235
    .line 236
    invoke-static {v3, v4}, Lf88;->b(J)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-nez v0, :cond_5

    .line 241
    .line 242
    :cond_4
    invoke-virtual {v5, v3, v4}, Lkd8;->j(J)V

    .line 243
    .line 244
    .line 245
    :cond_5
    :goto_5
    return-object v2

    .line 246
    :pswitch_1
    check-cast v6, Lox2;

    .line 247
    .line 248
    move-object v8, v5

    .line 249
    check-cast v8, Ldn2;

    .line 250
    .line 251
    move-object v9, v4

    .line 252
    check-cast v9, Lkx4;

    .line 253
    .line 254
    move-object v10, v3

    .line 255
    check-cast v10, Lig5;

    .line 256
    .line 257
    move-object/from16 v11, p1

    .line 258
    .line 259
    check-cast v11, Llp2;

    .line 260
    .line 261
    move-object/from16 v1, p2

    .line 262
    .line 263
    check-cast v1, Ljava/lang/Integer;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    const/16 v1, 0xc01

    .line 269
    .line 270
    invoke-static {v1}, Lw79;->P(I)I

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    iget-boolean v7, v0, Lmx2;->Y:Z

    .line 275
    .line 276
    invoke-static/range {v6 .. v12}, Lz68;->e(Lox2;ZLdn2;Lkx4;Lig5;Llp2;I)V

    .line 277
    .line 278
    .line 279
    return-object v2

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
