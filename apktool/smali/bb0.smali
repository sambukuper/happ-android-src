.class public final Lbb0;
.super Lkb8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic f0:B


# direct methods
.method public constructor <init>(B)V
    .locals 1

    .line 1
    iput-byte p1, p0, Lbb0;->f0:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class p1, Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    const-class p1, Ljava/util/TimeZone;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    const-class p1, Ljava/lang/String;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_2
    const-class p1, Ljava/net/InetSocketAddress;

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static r(Ljava/net/InetSocketAddress;Lro3;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    const/16 v2, 0x2f

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ltz v2, :cond_3

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    instance-of v0, v0, Ljava/net/Inet6Address;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v3, "["

    .line 38
    .line 39
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, "]"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_1
    move-object v1, v0

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/4 v0, 0x0

    .line 66
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_3
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v1, ":"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getPort()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p1, p0}, Lro3;->c1(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public c(Lt37;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-byte v0, p0, Lbb0;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lar3;->c(Lt37;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 8

    .line 1
    iget-byte p0, p0, Lbb0;->f0:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/TimeZone;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p2, p0}, Lro3;->c1(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lro3;->c1(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    check-cast p1, Ljava/net/InetSocketAddress;

    .line 23
    .line 24
    invoke-static {p1, p2}, Lbb0;->r(Ljava/net/InetSocketAddress;Lro3;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_2
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, p0

    .line 49
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    sub-int/2addr p1, p0

    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object p0, Lm10;->a:Ll10;

    .line 58
    .line 59
    invoke-virtual {p2, p0, p3, v0, p1}, Lro3;->u(Ll10;[BII)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, Lh90;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Lh90;-><init>(Ljava/nio/ByteBuffer;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    sget-object p3, Lm10;->a:Ll10;

    .line 81
    .line 82
    check-cast p2, Lr59;

    .line 83
    .line 84
    iget-char v0, p2, Lr59;->s0:C

    .line 85
    .line 86
    iget-object v1, p2, Leq2;->f0:Lk43;

    .line 87
    .line 88
    const-string v2, "Too few bytes available: missing "

    .line 89
    .line 90
    const-string v3, "write a binary value"

    .line 91
    .line 92
    invoke-virtual {p2, v3}, Lr59;->h1(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget v3, p2, Lr59;->v0:I

    .line 96
    .line 97
    iget v4, p2, Lr59;->w0:I

    .line 98
    .line 99
    if-lt v3, v4, :cond_1

    .line 100
    .line 101
    invoke-virtual {p2}, Lr59;->m1()V

    .line 102
    .line 103
    .line 104
    :cond_1
    iget-object v3, p2, Lr59;->t0:[C

    .line 105
    .line 106
    iget v5, p2, Lr59;->v0:I

    .line 107
    .line 108
    add-int/lit8 v6, v5, 0x1

    .line 109
    .line 110
    iput v6, p2, Lr59;->v0:I

    .line 111
    .line 112
    aput-char v0, v3, v5

    .line 113
    .line 114
    iget-object v3, v1, Lk43;->g0:[B

    .line 115
    .line 116
    if-nez v3, :cond_8

    .line 117
    .line 118
    iget-object v3, v1, Lk43;->Y:Lm90;

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v5, Lm90;->c:[I

    .line 124
    .line 125
    const/4 v6, 0x3

    .line 126
    aget v5, v5, v6

    .line 127
    .line 128
    if-lez v5, :cond_2

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_2
    const/4 v5, 0x0

    .line 132
    :goto_0
    iget-object v3, v3, Lm90;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 133
    .line 134
    const/4 v7, 0x0

    .line 135
    invoke-virtual {v3, v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, [B

    .line 140
    .line 141
    if-eqz v3, :cond_3

    .line 142
    .line 143
    array-length v6, v3

    .line 144
    if-ge v6, v5, :cond_4

    .line 145
    .line 146
    :cond_3
    new-array v3, v5, [B

    .line 147
    .line 148
    :cond_4
    iput-object v3, v1, Lk43;->g0:[B

    .line 149
    .line 150
    if-gez p0, :cond_5

    .line 151
    .line 152
    :try_start_0
    invoke-virtual {p2, p3, p1, v3}, Lr59;->q1(Ll10;Lh90;[B)I

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :catchall_0
    move-exception p0

    .line 157
    goto :goto_2

    .line 158
    :cond_5
    invoke-virtual {p2, p3, p1, v3, p0}, Lr59;->r1(Ll10;Lh90;[BI)I

    .line 159
    .line 160
    .line 161
    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    if-gtz p3, :cond_7

    .line 163
    .line 164
    :goto_1
    invoke-virtual {v1, v3}, Lk43;->g([B)V

    .line 165
    .line 166
    .line 167
    iget p0, p2, Lr59;->v0:I

    .line 168
    .line 169
    if-lt p0, v4, :cond_6

    .line 170
    .line 171
    invoke-virtual {p2}, Lr59;->m1()V

    .line 172
    .line 173
    .line 174
    :cond_6
    iget-object p0, p2, Lr59;->t0:[C

    .line 175
    .line 176
    iget p3, p2, Lr59;->v0:I

    .line 177
    .line 178
    add-int/lit8 v1, p3, 0x1

    .line 179
    .line 180
    iput v1, p2, Lr59;->v0:I

    .line 181
    .line 182
    aput-char v0, p0, p3

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_7
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string p3, " bytes (out of "

    .line 197
    .line 198
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string p0, ")"

    .line 205
    .line 206
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-virtual {p2, p0}, Lro3;->g(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 217
    :goto_2
    invoke-virtual {v1, v3}, Lk43;->g([B)V

    .line 218
    .line 219
    .line 220
    throw p0

    .line 221
    :cond_8
    const-string p0, "Trying to call same allocXxx() method second time"

    .line 222
    .line 223
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :goto_3
    return-void

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lbb0;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Lkb8;->f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p1, Ljava/util/TimeZone;

    .line 11
    .line 12
    sget-object p0, Lgr3;->i0:Lgr3;

    .line 13
    .line 14
    invoke-virtual {p4, p1, p0}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-class p3, Ljava/util/TimeZone;

    .line 19
    .line 20
    iput-object p3, p0, Lz76;->f0:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p4, p2, p0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p2, p1}, Lro3;->c1(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p4, p2, p0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p2, p1}, Lro3;->c1(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_2
    check-cast p1, Ljava/net/InetSocketAddress;

    .line 44
    .line 45
    sget-object p0, Lgr3;->i0:Lgr3;

    .line 46
    .line 47
    invoke-virtual {p4, p1, p0}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-class p3, Ljava/net/InetSocketAddress;

    .line 52
    .line 53
    iput-object p3, p0, Lz76;->f0:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {p4, p2, p0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p1, p2}, Lbb0;->r(Ljava/net/InetSocketAddress;Lro3;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p4, p2, p0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
