.class public final Lmq0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lms;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 2
    .line 3
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->I0:Lvz7;

    .line 8
    .line 9
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lms;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lmq0;->a:Lms;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lmq0;->a:Lms;

    .line 2
    .line 3
    iget-object v1, v0, Lms;->b:Lrp8;

    .line 4
    .line 5
    instance-of v2, p1, Llq0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    check-cast v2, Llq0;

    .line 11
    .line 12
    iget v3, v2, Llq0;->i0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Llq0;->i0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Llq0;

    .line 25
    .line 26
    invoke-direct {v2, p0, p1}, Llq0;-><init>(Lmq0;Ls51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v2, Llq0;->g0:Ljava/lang/Object;

    .line 30
    .line 31
    iget p1, v2, Llq0;->i0:I

    .line 32
    .line 33
    const-string v3, "4.9.0"

    .line 34
    .line 35
    const/4 v4, 0x3

    .line 36
    const/4 v5, 0x2

    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    sget-object v8, Lc71;->X:Lc71;

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    if-eq p1, v6, :cond_3

    .line 44
    .line 45
    if-eq p1, v5, :cond_2

    .line 46
    .line 47
    if-ne p1, v4, :cond_1

    .line 48
    .line 49
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v7

    .line 60
    :cond_2
    iget-object p1, v2, Llq0;->f0:Lzo8;

    .line 61
    .line 62
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput v6, v2, Llq0;->i0:I

    .line 74
    .line 75
    iget-object p0, v1, Lrp8;->i:Lxe2;

    .line 76
    .line 77
    invoke-static {p0, v2}, Lgv3;->q(Lxe2;Ls51;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-ne p0, v8, :cond_5

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_5
    :goto_1
    move-object p1, p0

    .line 85
    check-cast p1, Lzo8;

    .line 86
    .line 87
    iput-object p1, v2, Llq0;->f0:Lzo8;

    .line 88
    .line 89
    iput v5, v2, Llq0;->i0:I

    .line 90
    .line 91
    iget-object p0, v1, Lrp8;->g:Lxe2;

    .line 92
    .line 93
    invoke-static {p0, v2}, Lgv3;->q(Lxe2;Ls51;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-ne p0, v8, :cond_6

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_6
    :goto_2
    check-cast p0, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 101
    .line 102
    if-eqz p1, :cond_8

    .line 103
    .line 104
    if-eqz p0, :cond_8

    .line 105
    .line 106
    invoke-virtual {p0}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;->f()Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sget-object v1, Lkq0;->a:[I

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    aget v0, v1, v0

    .line 117
    .line 118
    iget-object v1, p1, Lzo8;->f0:Lyp8;

    .line 119
    .line 120
    const/4 v2, 0x0

    .line 121
    if-ne v0, v6, :cond_7

    .line 122
    .line 123
    new-instance p0, Lfa3;

    .line 124
    .line 125
    iget-object p1, v1, Lyp8;->g0:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {p1, v3}, Lms;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    xor-int/2addr p1, v6

    .line 132
    invoke-direct {p0, p1, v2}, Lfa3;-><init>(ZZ)V

    .line 133
    .line 134
    .line 135
    return-object p0

    .line 136
    :cond_7
    new-instance v0, Lga3;

    .line 137
    .line 138
    iget-object v1, v1, Lyp8;->g0:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v1, v3}, Lms;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    xor-int/2addr v1, v6

    .line 145
    invoke-direct {v0, p1, p0, v1, v2}, Lga3;-><init>(Lzo8;Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;ZZ)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_8
    :try_start_0
    new-instance p0, Ljava/io/File;

    .line 150
    .line 151
    iget-object p1, v1, Lrp8;->f:Landroid/net/Uri;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-eqz p1, :cond_9

    .line 158
    .line 159
    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :catchall_0
    move-exception p0

    .line 167
    goto :goto_3

    .line 168
    :cond_9
    const-string p0, "Required value was null."

    .line 169
    .line 170
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 171
    .line 172
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    :goto_3
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 177
    .line 178
    if-nez p1, :cond_c

    .line 179
    .line 180
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 181
    .line 182
    if-nez p1, :cond_c

    .line 183
    .line 184
    :goto_4
    iput-object v7, v2, Llq0;->f0:Lzo8;

    .line 185
    .line 186
    iput v4, v2, Llq0;->i0:I

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Lms;->a(Ls51;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-ne p0, v8, :cond_a

    .line 193
    .line 194
    :goto_5
    return-object v8

    .line 195
    :cond_a
    :goto_6
    check-cast p0, Lzo8;

    .line 196
    .line 197
    if-eqz p0, :cond_b

    .line 198
    .line 199
    new-instance v7, Lha3;

    .line 200
    .line 201
    iget-object p1, p0, Lzo8;->f0:Lyp8;

    .line 202
    .line 203
    iget-object p1, p1, Lyp8;->g0:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {p1, v3}, Lms;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    xor-int/2addr p1, v6

    .line 210
    invoke-direct {v7, p0, p1}, Lha3;-><init>(Lzo8;Z)V

    .line 211
    .line 212
    .line 213
    :cond_b
    return-object v7

    .line 214
    :cond_c
    throw p0
.end method
