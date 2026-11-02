.class public final synthetic Ld40;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/util/List;

.field public final synthetic Z:Z

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ll49;Ll49;Ljava/util/List;Ljava/util/Set;ZLx39;)V
    .locals 0

    .line 22
    const/4 p8, 0x1

    iput-byte p8, p0, Ld40;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld40;->f0:Ljava/lang/Object;

    iput-object p2, p0, Ld40;->g0:Ljava/lang/Object;

    iput-object p3, p0, Ld40;->h0:Ljava/lang/Object;

    iput-object p4, p0, Ld40;->i0:Ljava/lang/Object;

    iput-object p5, p0, Ld40;->Y:Ljava/util/List;

    iput-object p6, p0, Ld40;->j0:Ljava/lang/Object;

    iput-boolean p7, p0, Ld40;->Z:Z

    return-void
.end method

.method public synthetic constructor <init>(Lo88;Lz24;Ljava/util/List;Lql;Lfi1;Lfi2;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Ld40;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ld40;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ld40;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ld40;->Y:Ljava/util/List;

    .line 12
    .line 13
    iput-object p4, p0, Ld40;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Ld40;->i0:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Ld40;->j0:Ljava/lang/Object;

    .line 18
    .line 19
    iput-boolean p7, p0, Ld40;->Z:Z

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Ld40;->X:B

    .line 4
    .line 5
    iget-object v2, v0, Ld40;->j0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, Ld40;->Y:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, v0, Ld40;->i0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Ld40;->h0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Ld40;->g0:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Ld40;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v7, Landroidx/work/impl/WorkDatabase;

    .line 21
    .line 22
    check-cast v6, Ljava/lang/String;

    .line 23
    .line 24
    check-cast v5, Ll49;

    .line 25
    .line 26
    move-object v8, v4

    .line 27
    check-cast v8, Ll49;

    .line 28
    .line 29
    check-cast v2, Ljava/util/Set;

    .line 30
    .line 31
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->y()Lp49;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object v10, v5, Ll49;->b:Lu39;

    .line 40
    .line 41
    iget v13, v5, Ll49;->k:I

    .line 42
    .line 43
    iget-wide v14, v5, Ll49;->n:J

    .line 44
    .line 45
    iget v9, v5, Ll49;->t:I

    .line 46
    .line 47
    const/4 v11, 0x1

    .line 48
    add-int/lit8 v17, v9, 0x1

    .line 49
    .line 50
    iget v9, v5, Ll49;->s:I

    .line 51
    .line 52
    iget-wide v11, v5, Ll49;->u:J

    .line 53
    .line 54
    iget v5, v5, Ll49;->v:I

    .line 55
    .line 56
    move-wide/from16 v18, v11

    .line 57
    .line 58
    const/4 v12, 0x0

    .line 59
    const v21, 0x1c3dbfd

    .line 60
    .line 61
    .line 62
    move/from16 v16, v9

    .line 63
    .line 64
    const/4 v11, 0x1

    .line 65
    const/4 v9, 0x0

    .line 66
    move/from16 v20, v11

    .line 67
    .line 68
    const/4 v11, 0x0

    .line 69
    move/from16 v22, v20

    .line 70
    .line 71
    move/from16 v20, v5

    .line 72
    .line 73
    move/from16 v5, v22

    .line 74
    .line 75
    invoke-static/range {v8 .. v21}, Ll49;->b(Ll49;Ljava/lang/String;Lu39;Ljava/lang/String;Lu91;IJIIJII)Ll49;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    iget v10, v8, Ll49;->v:I

    .line 80
    .line 81
    if-ne v10, v5, :cond_0

    .line 82
    .line 83
    iget-wide v10, v8, Ll49;->u:J

    .line 84
    .line 85
    iput-wide v10, v9, Ll49;->u:J

    .line 86
    .line 87
    iget v8, v9, Ll49;->v:I

    .line 88
    .line 89
    add-int/2addr v8, v5

    .line 90
    iput v8, v9, Ll49;->v:I

    .line 91
    .line 92
    :cond_0
    invoke-static {v3, v9}, Lz51;->Z(Ljava/util/List;Ll49;)Ll49;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v8, v1, Ln49;->a:Lql6;

    .line 100
    .line 101
    new-instance v9, Lpy7;

    .line 102
    .line 103
    invoke-direct {v9, v1, v3}, Lpy7;-><init>(Ln49;Ll49;)V

    .line 104
    .line 105
    .line 106
    const/4 v3, 0x0

    .line 107
    invoke-static {v8, v3, v5, v9}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object v8, v4, Lp49;->a:Lql6;

    .line 117
    .line 118
    new-instance v9, Lnm7;

    .line 119
    .line 120
    const/16 v10, 0x13

    .line 121
    .line 122
    invoke-direct {v9, v6, v10}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 123
    .line 124
    .line 125
    invoke-static {v8, v3, v5, v9}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v6, v2}, Lp49;->a(Ljava/lang/String;Ljava/util/Set;)V

    .line 129
    .line 130
    .line 131
    iget-boolean v0, v0, Ld40;->Z:Z

    .line 132
    .line 133
    if-nez v0, :cond_1

    .line 134
    .line 135
    const-wide/16 v8, -0x1

    .line 136
    .line 137
    invoke-virtual {v1, v8, v9, v6}, Ln49;->e(JLjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->w()Ld49;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v0, v0, Ld49;->a:Lql6;

    .line 148
    .line 149
    new-instance v1, Lnm7;

    .line 150
    .line 151
    const/4 v2, 0x5

    .line 152
    invoke-direct {v1, v6, v2}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v3, v5, v1}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    :cond_1
    return-void

    .line 159
    :pswitch_0
    check-cast v7, Lo88;

    .line 160
    .line 161
    check-cast v6, Lz24;

    .line 162
    .line 163
    move-object v9, v5

    .line 164
    check-cast v9, Lql;

    .line 165
    .line 166
    move-object v12, v4

    .line 167
    check-cast v12, Lfi1;

    .line 168
    .line 169
    move-object v13, v2

    .line 170
    check-cast v13, Lfi2;

    .line 171
    .line 172
    iget-boolean v14, v0, Ld40;->Z:Z

    .line 173
    .line 174
    const-string v0, "BackgroundTextMeasurement"

    .line 175
    .line 176
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :try_start_0
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    instance-of v1, v0, Lx05;

    .line 184
    .line 185
    const/4 v2, 0x0

    .line 186
    if-eqz v1, :cond_2

    .line 187
    .line 188
    check-cast v0, Lx05;

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_2
    move-object v0, v2

    .line 192
    :goto_0
    if-eqz v0, :cond_4

    .line 193
    .line 194
    invoke-virtual {v0, v2, v2}, Lx05;->C(Lgn2;Lgn2;)Lx05;

    .line 195
    .line 196
    .line 197
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 198
    if-eqz v1, :cond_4

    .line 199
    .line 200
    :try_start_1
    invoke-virtual {v1}, Ldd7;->j()Ldd7;

    .line 201
    .line 202
    .line 203
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 204
    :try_start_2
    invoke-static {v7, v6}, Lxt7;->d(Lo88;Lz24;)Lo88;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    if-nez v3, :cond_3

    .line 209
    .line 210
    sget-object v3, Ld02;->X:Ld02;

    .line 211
    .line 212
    :cond_3
    move-object v11, v3

    .line 213
    goto :goto_1

    .line 214
    :catchall_0
    move-exception v0

    .line 215
    goto :goto_2

    .line 216
    :goto_1
    new-instance v8, Ly5;

    .line 217
    .line 218
    invoke-direct/range {v8 .. v14}, Ly5;-><init>(Lql;Lo88;Ljava/util/List;Lfi1;Lfi2;Z)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v8}, Ly5;->l()F

    .line 222
    .line 223
    .line 224
    invoke-virtual {v8}, Ly5;->h()F
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 225
    .line 226
    .line 227
    :try_start_3
    invoke-static {v2}, Ldd7;->q(Ldd7;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 228
    .line 229
    .line 230
    :try_start_4
    invoke-virtual {v1}, Lx05;->w()Lys0;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v0}, Lys0;->l()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Lx05;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 238
    .line 239
    .line 240
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :catchall_1
    move-exception v0

    .line 245
    goto :goto_3

    .line 246
    :goto_2
    :try_start_5
    invoke-static {v2}, Ldd7;->q(Ldd7;)V

    .line 247
    .line 248
    .line 249
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 250
    :goto_3
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 251
    :catchall_2
    move-exception v0

    .line 252
    :try_start_7
    invoke-virtual {v1}, Lx05;->c()V

    .line 253
    .line 254
    .line 255
    throw v0

    .line 256
    :catchall_3
    move-exception v0

    .line 257
    goto :goto_4

    .line 258
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 259
    .line 260
    const-string v1, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 261
    .line 262
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 266
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
