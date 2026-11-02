.class public final Lzn8;
.super Lcw0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic f0:B


# direct methods
.method public synthetic constructor <init>(Lsun/misc/Unsafe;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lzn8;->f0:B

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcw0;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A0(Ljava/lang/Object;JF)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lzn8;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsun/misc/Unsafe;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putFloat(Ljava/lang/Object;JF)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lsun/misc/Unsafe;

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    invoke-static {p4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lsun/misc/Unsafe;

    .line 33
    .line 34
    invoke-virtual {p0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public D0()Z
    .locals 5

    .line 1
    iget-byte v0, p0, Lzn8;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcw0;->D0()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-super {p0}, Lcw0;->D0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_0
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lsun/misc/Unsafe;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "getByte"

    .line 28
    .line 29
    const-class v2, Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {p0, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    const-string v0, "putByte"

    .line 41
    .line 42
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {p0, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    const-string v0, "getBoolean"

    .line 52
    .line 53
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {p0, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    const-string v0, "putBoolean"

    .line 61
    .line 62
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {p0, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    const-string v0, "getFloat"

    .line 72
    .line 73
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {p0, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    const-string v0, "putFloat"

    .line 81
    .line 82
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {p0, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    const-string v0, "getDouble"

    .line 92
    .line 93
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {p0, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    const-string v0, "putDouble"

    .line 101
    .line 102
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 103
    .line 104
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    goto :goto_0

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    invoke-static {p0}, Lao8;->i(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    return v1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final E0()Z
    .locals 7

    .line 1
    iget-byte v0, p0, Lzn8;->f0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const-string v0, "copyMemory"

    .line 8
    .line 9
    const-string v2, "getLong"

    .line 10
    .line 11
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lsun/misc/Unsafe;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "objectFieldOffset"

    .line 24
    .line 25
    const-class v5, Ljava/lang/reflect/Field;

    .line 26
    .line 27
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    const-class v4, Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v3, v2, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lao8;->c()Ljava/lang/reflect/Field;

    .line 46
    .line 47
    .line 48
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v3, "getByte"

    .line 57
    .line 58
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {p0, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    const-string v3, "putByte"

    .line 66
    .line 67
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    filled-new-array {v5, v6}, [Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {p0, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 74
    .line 75
    .line 76
    const-string v3, "getInt"

    .line 77
    .line 78
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {p0, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    const-string v3, "putInt"

    .line 86
    .line 87
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    filled-new-array {v5, v6}, [Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-virtual {p0, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 94
    .line 95
    .line 96
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {p0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    const-string v2, "putLong"

    .line 104
    .line 105
    filled-new-array {v5, v5}, [Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {p0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 110
    .line 111
    .line 112
    filled-new-array {v5, v5, v5}, [Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 117
    .line 118
    .line 119
    filled-new-array {v4, v5, v4, v5, v5}, [Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    const/4 v1, 0x1

    .line 127
    goto :goto_0

    .line 128
    :catchall_0
    move-exception p0

    .line 129
    invoke-static {p0}, Lao8;->i(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :catchall_1
    move-exception p0

    .line 134
    invoke-static {p0}, Lao8;->i(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    :goto_0
    :pswitch_0
    return v1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final s0(JLjava/lang/Object;)Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lzn8;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsun/misc/Unsafe;

    .line 9
    .line 10
    invoke-virtual {p0, p3, p1, p2}, Lsun/misc/Unsafe;->getBoolean(Ljava/lang/Object;J)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    sget-boolean p0, Lao8;->g:Z

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-static {p1, p2, p3}, Lao8;->e(JLjava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-wide/16 v0, -0x4

    .line 25
    .line 26
    and-long/2addr v0, p1

    .line 27
    invoke-static {v0, v1, p3}, Lao8;->f(JLjava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    const-wide/16 v0, 0x3

    .line 32
    .line 33
    and-long/2addr p1, v0

    .line 34
    const/4 p3, 0x3

    .line 35
    shl-long/2addr p1, p3

    .line 36
    long-to-int p1, p1

    .line 37
    ushr-int/2addr p0, p1

    .line 38
    and-int/lit16 p0, p0, 0xff

    .line 39
    .line 40
    int-to-byte p0, p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    :goto_0
    return p0

    .line 47
    :pswitch_1
    sget-boolean p0, Lao8;->g:Z

    .line 48
    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    invoke-static {p1, p2, p3}, Lao8;->e(JLjava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const-wide/16 v0, -0x4

    .line 57
    .line 58
    and-long/2addr v0, p1

    .line 59
    invoke-static {v0, v1, p3}, Lao8;->f(JLjava/lang/Object;)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    const-wide/16 v0, 0x3

    .line 64
    .line 65
    and-long/2addr p1, v0

    .line 66
    const/4 p3, 0x3

    .line 67
    shl-long/2addr p1, p3

    .line 68
    long-to-int p1, p1

    .line 69
    ushr-int/2addr p0, p1

    .line 70
    and-int/lit16 p0, p0, 0xff

    .line 71
    .line 72
    int-to-byte p0, p0

    .line 73
    if-eqz p0, :cond_3

    .line 74
    .line 75
    const/4 p0, 0x1

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/4 p0, 0x0

    .line 78
    :goto_1
    return p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t0(JLjava/lang/Object;)D
    .locals 1

    .line 1
    iget-byte v0, p0, Lzn8;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsun/misc/Unsafe;

    .line 9
    .line 10
    invoke-virtual {p0, p3, p1, p2}, Lsun/misc/Unsafe;->getDouble(Ljava/lang/Object;J)D

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {p0, p3, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 24
    .line 25
    .line 26
    move-result-wide p0

    .line 27
    return-wide p0

    .line 28
    :pswitch_1
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lsun/misc/Unsafe;

    .line 31
    .line 32
    invoke-virtual {p0, p3, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 37
    .line 38
    .line 39
    move-result-wide p0

    .line 40
    return-wide p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u0(JLjava/lang/Object;)F
    .locals 1

    .line 1
    iget-byte v0, p0, Lzn8;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsun/misc/Unsafe;

    .line 9
    .line 10
    invoke-virtual {p0, p3, p1, p2}, Lsun/misc/Unsafe;->getFloat(Ljava/lang/Object;J)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {p0, p3, p1, p2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :pswitch_1
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lsun/misc/Unsafe;

    .line 31
    .line 32
    invoke-virtual {p0, p3, p1, p2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x0(Ljava/lang/Object;JZ)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lzn8;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsun/misc/Unsafe;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putBoolean(Ljava/lang/Object;JZ)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-boolean p0, Lao8;->g:Z

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    int-to-byte p0, p4

    .line 19
    invoke-static {p1, p2, p3, p0}, Lao8;->k(Ljava/lang/Object;JB)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    int-to-byte p0, p4

    .line 24
    invoke-static {p1, p2, p3, p0}, Lao8;->l(Ljava/lang/Object;JB)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :pswitch_1
    sget-boolean p0, Lao8;->g:Z

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    int-to-byte p0, p4

    .line 33
    invoke-static {p1, p2, p3, p0}, Lao8;->k(Ljava/lang/Object;JB)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    int-to-byte p0, p4

    .line 38
    invoke-static {p1, p2, p3, p0}, Lao8;->l(Ljava/lang/Object;JB)V

    .line 39
    .line 40
    .line 41
    :goto_1
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final y0(Ljava/lang/Object;JB)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lzn8;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsun/misc/Unsafe;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-boolean p0, Lao8;->g:Z

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-static {p1, p2, p3, p4}, Lao8;->k(Ljava/lang/Object;JB)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p1, p2, p3, p4}, Lao8;->l(Ljava/lang/Object;JB)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :pswitch_1
    sget-boolean p0, Lao8;->g:Z

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-static {p1, p2, p3, p4}, Lao8;->k(Ljava/lang/Object;JB)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1, p2, p3, p4}, Lao8;->l(Ljava/lang/Object;JB)V

    .line 35
    .line 36
    .line 37
    :goto_1
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z0(Ljava/lang/Object;JD)V
    .locals 6

    .line 1
    iget-byte v0, p0, Lzn8;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Lsun/misc/Unsafe;

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    move-wide v2, p2

    .line 13
    move-wide v4, p4

    .line 14
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putDouble(Ljava/lang/Object;JD)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    move-wide v4, p4

    .line 19
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 20
    .line 21
    .line 22
    move-result-wide p4

    .line 23
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lsun/misc/Unsafe;

    .line 26
    .line 27
    invoke-virtual/range {p0 .. p5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    move-wide v4, p4

    .line 32
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 33
    .line 34
    .line 35
    move-result-wide p4

    .line 36
    iget-object p0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lsun/misc/Unsafe;

    .line 39
    .line 40
    invoke-virtual/range {p0 .. p5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
