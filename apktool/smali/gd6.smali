.class public final Lgd6;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

.field public final synthetic j0:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;Lq51;Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lgd6;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lgd6;->i0:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    .line 4
    .line 5
    iput-object p3, p0, Lgd6;->j0:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lgd6;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lgd6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lgd6;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lgd6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lgd6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lgd6;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lgd6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte p2, p0, Lgd6;->g0:B

    .line 2
    .line 3
    iget-object v0, p0, Lgd6;->j0:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    .line 4
    .line 5
    iget-object p0, p0, Lgd6;->i0:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p2, Lgd6;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p2, p0, p1, v0, v1}, Lgd6;-><init>(Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;Lq51;Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;B)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :pswitch_0
    new-instance p2, Lgd6;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p2, p0, p1, v0, v1}, Lgd6;-><init>(Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;Lq51;Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;B)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lgd6;->g0:B

    .line 2
    .line 3
    const-string v1, "Need to specify a package name for the Remote Service."

    .line 4
    .line 5
    const-string v2, "Need to specify a class name for the Remote Service."

    .line 6
    .line 7
    iget-object v3, p0, Lgd6;->j0:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    .line 8
    .line 9
    const-string v4, "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME"

    .line 10
    .line 11
    const-string v5, "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME"

    .line 12
    .line 13
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    sget-object v7, Lc71;->X:Lc71;

    .line 16
    .line 17
    iget-object v8, p0, Lgd6;->i0:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    const/4 v10, 0x0

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-object v0, v8, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 25
    .line 26
    iget-object v11, v8, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->g:Ljc4;

    .line 27
    .line 28
    iget-boolean v12, p0, Lgd6;->h0:Z

    .line 29
    .line 30
    if-eqz v12, :cond_1

    .line 31
    .line 32
    if-ne v12, v9, :cond_0

    .line 33
    .line 34
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_2

    .line 40
    :cond_0
    invoke-static {v6}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    move-object v7, v10

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, v0, Landroidx/work/WorkerParameters;->b:Lu91;

    .line 49
    .line 50
    invoke-virtual {p1, v5}, Lu91;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Lu91;

    .line 55
    .line 56
    invoke-virtual {v0, v4}, Lu91;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    new-instance v1, Landroid/content/ComponentName;

    .line 65
    .line 66
    invoke-direct {v1, p1, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, v8, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->h:Landroid/content/ComponentName;

    .line 70
    .line 71
    :try_start_1
    new-instance p1, Ly45;

    .line 72
    .line 73
    invoke-direct {p1, v3}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11, v1, p1}, Ljc4;->a(Landroid/content/ComponentName;Lbd6;)Lwy7;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-boolean v9, p0, Lgd6;->h0:Z

    .line 81
    .line 82
    invoke-static {p1, v8, p0}, Lb59;->a(Lxb4;Lec4;Luy7;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v7, :cond_2

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_2
    :goto_1
    check-cast p1, [B

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    sget-object p0, Llh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 95
    .line 96
    invoke-static {p1, p0}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    check-cast p0, Llh5;

    .line 104
    .line 105
    iget-object v7, p0, Llh5;->X:Ldc4;

    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    invoke-static {}, Llh4;->P0()Llh4;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v11}, Ljc4;->b()V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :goto_2
    invoke-static {}, Llh4;->P0()Llh4;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v11}, Ljc4;->b()V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    :cond_3
    invoke-static {v2}, Lbt;->q(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    invoke-static {v1}, Lbt;->q(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :goto_3
    return-object v7

    .line 141
    :pswitch_0
    iget-object v0, v8, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 142
    .line 143
    iget-object v11, v8, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->g:Ljc4;

    .line 144
    .line 145
    iget-boolean v12, p0, Lgd6;->h0:Z

    .line 146
    .line 147
    if-eqz v12, :cond_6

    .line 148
    .line 149
    if-ne v12, v9, :cond_5

    .line 150
    .line 151
    :try_start_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :catchall_1
    move-exception p0

    .line 156
    goto :goto_6

    .line 157
    :cond_5
    invoke-static {v6}, Lbt;->i(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :goto_4
    move-object v7, v10

    .line 161
    goto :goto_7

    .line 162
    :cond_6
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, v0, Landroidx/work/WorkerParameters;->b:Lu91;

    .line 166
    .line 167
    invoke-virtual {p1, v5}, Lu91;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Lu91;

    .line 172
    .line 173
    invoke-virtual {v0, v4}, Lu91;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz p1, :cond_9

    .line 178
    .line 179
    if-eqz v0, :cond_8

    .line 180
    .line 181
    new-instance v1, Landroid/content/ComponentName;

    .line 182
    .line 183
    invoke-direct {v1, p1, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    iput-object v1, v8, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->h:Landroid/content/ComponentName;

    .line 187
    .line 188
    :try_start_3
    new-instance p1, Llr5;

    .line 189
    .line 190
    const/4 v0, 0x6

    .line 191
    invoke-direct {p1, v3, v0}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v11, v1, p1}, Ljc4;->a(Landroid/content/ComponentName;Lbd6;)Lwy7;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iput-boolean v9, p0, Lgd6;->h0:Z

    .line 199
    .line 200
    invoke-static {p1, v8, p0}, Lb59;->a(Lxb4;Lec4;Luy7;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    if-ne p1, v7, :cond_7

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_7
    :goto_5
    check-cast p1, [B

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    sget-object p0, Lgh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 213
    .line 214
    invoke-static {p1, p0}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    check-cast p0, Lgh5;

    .line 222
    .line 223
    iget-object v7, p0, Lgh5;->X:Lkj2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 224
    .line 225
    invoke-static {}, Llh4;->P0()Llh4;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v11}, Ljc4;->b()V

    .line 233
    .line 234
    .line 235
    goto :goto_7

    .line 236
    :goto_6
    invoke-static {}, Llh4;->P0()Llh4;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v11}, Ljc4;->b()V

    .line 244
    .line 245
    .line 246
    throw p0

    .line 247
    :cond_8
    invoke-static {v2}, Lbt;->q(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_9
    invoke-static {v1}, Lbt;->q(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto :goto_4

    .line 255
    :goto_7
    return-object v7

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
