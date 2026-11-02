.class public final Lxf7;
.super Lzf7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public final isEmpty()Z
    .locals 5

    .line 1
    sget-object v0, Lsn8;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lag7;->i0:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    sget-wide v3, Lzf7;->j0:J

    .line 10
    .line 11
    invoke-virtual {v0, p0, v3, v4}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    cmp-long p0, v1, v3

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-wide v1, p0, Lag7;->producerIndex:J

    .line 5
    .line 6
    invoke-virtual {p0, v1, v2}, Lf11;->a(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v3

    .line 10
    sget-object v5, Lsn8;->a:Lsun/misc/Unsafe;

    .line 11
    .line 12
    iget-object v6, p0, Lf11;->Y:[Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v5, v6, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    if-eqz v7, :cond_0

    .line 19
    .line 20
    return v0

    .line 21
    :cond_0
    invoke-virtual {v5, v6, v3, v4, p1}, Lsun/misc/Unsafe;->putOrderedObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v3, 0x1

    .line 25
    .line 26
    add-long v9, v1, v3

    .line 27
    .line 28
    sget-wide v7, Lag7;->i0:J

    .line 29
    .line 30
    move-object v6, p0

    .line 31
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->putOrderedLong(Ljava/lang/Object;JJ)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_1
    const-string p0, "null elements not allowed"

    .line 37
    .line 38
    invoke-static {p0}, Lb61;->i(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return v0
.end method

.method public final peek()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-wide v0, p0, Lzf7;->consumerIndex:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lf11;->a(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object p0, p0, Lf11;->Y:[Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v2, Lsn8;->a:Lsun/misc/Unsafe;

    .line 10
    .line 11
    invoke-virtual {v2, p0, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-wide v0, p0, Lzf7;->consumerIndex:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lf11;->a(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    sget-object v4, Lsn8;->a:Lsun/misc/Unsafe;

    .line 8
    .line 9
    iget-object v5, p0, Lf11;->Y:[Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v4, v5, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v10

    .line 15
    const/4 v6, 0x0

    .line 16
    if-nez v10, :cond_0

    .line 17
    .line 18
    return-object v6

    .line 19
    :cond_0
    invoke-virtual {v4, v5, v2, v3, v6}, Lsun/misc/Unsafe;->putOrderedObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const-wide/16 v2, 0x1

    .line 23
    .line 24
    add-long v8, v0, v2

    .line 25
    .line 26
    sget-wide v6, Lzf7;->j0:J

    .line 27
    .line 28
    move-object v5, p0

    .line 29
    invoke-virtual/range {v4 .. v9}, Lsun/misc/Unsafe;->putOrderedLong(Ljava/lang/Object;JJ)V

    .line 30
    .line 31
    .line 32
    return-object v10
.end method

.method public final size()I
    .locals 9

    .line 1
    sget-object v0, Lsn8;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lzf7;->j0:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    :goto_0
    sget-object v0, Lsn8;->a:Lsun/misc/Unsafe;

    .line 10
    .line 11
    sget-wide v5, Lag7;->i0:J

    .line 12
    .line 13
    invoke-virtual {v0, p0, v5, v6}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v7

    .line 21
    cmp-long v0, v3, v7

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    sub-long/2addr v5, v7

    .line 26
    long-to-int p0, v5

    .line 27
    return p0

    .line 28
    :cond_0
    move-wide v3, v7

    .line 29
    goto :goto_0
.end method
