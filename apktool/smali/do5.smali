.class public abstract Ldo5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfi1;


# instance fields
.field public X:Z


# direct methods
.method public static f(Ldo5;Leo5;II)V
    .locals 4

    .line 1
    int-to-long v0, p2

    .line 2
    const/16 p2, 0x20

    .line 3
    .line 4
    shl-long/2addr v0, p2

    .line 5
    int-to-long p2, p3

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p2, v2

    .line 12
    or-long/2addr p2, v0

    .line 13
    invoke-virtual {p0, p1}, Ldo5;->d(Leo5;)V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p1, Leo5;->g0:J

    .line 17
    .line 18
    invoke-static {p2, p3, v0, v1}, Lhf3;->c(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    const/4 p0, 0x0

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p1, p2, p3, p0, v0}, Leo5;->S(JFLgn2;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static g(Ldo5;Leo5;J)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ldo5;->d(Leo5;)V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p1, Leo5;->g0:J

    .line 5
    .line 6
    invoke-static {p2, p3, v0, v1}, Lhf3;->c(JJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p2

    .line 10
    const/4 p0, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, p2, p3, p0, v0}, Leo5;->S(JFLgn2;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static h(Ldo5;Leo5;II)V
    .locals 9

    .line 1
    int-to-long v0, p2

    .line 2
    const/16 p2, 0x20

    .line 3
    .line 4
    shl-long/2addr v0, p2

    .line 5
    int-to-long v2, p3

    .line 6
    const-wide v4, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr v2, v4

    .line 12
    or-long/2addr v0, v2

    .line 13
    invoke-virtual {p0}, Ldo5;->b()Lz24;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    sget-object v2, Lz24;->X:Lz24;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    if-eq p3, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Ldo5;->c()I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-nez p3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Ldo5;->c()I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    iget v2, p1, Leo5;->X:I

    .line 35
    .line 36
    sub-int/2addr p3, v2

    .line 37
    shr-long v7, v0, p2

    .line 38
    .line 39
    long-to-int v2, v7

    .line 40
    sub-int/2addr p3, v2

    .line 41
    and-long/2addr v0, v4

    .line 42
    long-to-int v0, v0

    .line 43
    int-to-long v1, p3

    .line 44
    shl-long p2, v1, p2

    .line 45
    .line 46
    int-to-long v0, v0

    .line 47
    and-long/2addr v0, v4

    .line 48
    or-long/2addr p2, v0

    .line 49
    invoke-virtual {p0, p1}, Ldo5;->d(Leo5;)V

    .line 50
    .line 51
    .line 52
    iget-wide v0, p1, Leo5;->g0:J

    .line 53
    .line 54
    invoke-static {p2, p3, v0, v1}, Lhf3;->c(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide p2

    .line 58
    invoke-virtual {p1, p2, p3, v3, v6}, Leo5;->S(JFLgn2;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ldo5;->d(Leo5;)V

    .line 63
    .line 64
    .line 65
    iget-wide p2, p1, Leo5;->g0:J

    .line 66
    .line 67
    invoke-static {v0, v1, p2, p3}, Lhf3;->c(JJ)J

    .line 68
    .line 69
    .line 70
    move-result-wide p2

    .line 71
    invoke-virtual {p1, p2, p3, v3, v6}, Leo5;->S(JFLgn2;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public static j(Ldo5;Leo5;II)V
    .locals 9

    .line 1
    sget-object v0, Lfo5;->a:Ldx4;

    .line 2
    .line 3
    int-to-long v1, p2

    .line 4
    const/16 p2, 0x20

    .line 5
    .line 6
    shl-long/2addr v1, p2

    .line 7
    int-to-long v3, p3

    .line 8
    const-wide v5, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    and-long/2addr v3, v5

    .line 14
    or-long/2addr v1, v3

    .line 15
    invoke-virtual {p0}, Ldo5;->b()Lz24;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    sget-object v3, Lz24;->X:Lz24;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eq p3, v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ldo5;->c()I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-nez p3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Ldo5;->c()I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    iget v3, p1, Leo5;->X:I

    .line 36
    .line 37
    sub-int/2addr p3, v3

    .line 38
    shr-long v7, v1, p2

    .line 39
    .line 40
    long-to-int v3, v7

    .line 41
    sub-int/2addr p3, v3

    .line 42
    and-long/2addr v1, v5

    .line 43
    long-to-int v1, v1

    .line 44
    int-to-long v2, p3

    .line 45
    shl-long p2, v2, p2

    .line 46
    .line 47
    int-to-long v1, v1

    .line 48
    and-long/2addr v1, v5

    .line 49
    or-long/2addr p2, v1

    .line 50
    invoke-virtual {p0, p1}, Ldo5;->d(Leo5;)V

    .line 51
    .line 52
    .line 53
    iget-wide v1, p1, Leo5;->g0:J

    .line 54
    .line 55
    invoke-static {p2, p3, v1, v2}, Lhf3;->c(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide p2

    .line 59
    invoke-virtual {p1, p2, p3, v4, v0}, Leo5;->S(JFLgn2;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ldo5;->d(Leo5;)V

    .line 64
    .line 65
    .line 66
    iget-wide p2, p1, Leo5;->g0:J

    .line 67
    .line 68
    invoke-static {v1, v2, p2, p3}, Lhf3;->c(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide p2

    .line 72
    invoke-virtual {p1, p2, p3, v4, v0}, Leo5;->S(JFLgn2;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static k(Ldo5;Leo5;IILgn2;I)V
    .locals 4

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p4, Lfo5;->a:Ldx4;

    .line 6
    .line 7
    :cond_0
    int-to-long v0, p2

    .line 8
    const/16 p2, 0x20

    .line 9
    .line 10
    shl-long/2addr v0, p2

    .line 11
    int-to-long p2, p3

    .line 12
    const-wide v2, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr p2, v2

    .line 18
    or-long/2addr p2, v0

    .line 19
    invoke-virtual {p0, p1}, Ldo5;->d(Leo5;)V

    .line 20
    .line 21
    .line 22
    iget-wide v0, p1, Leo5;->g0:J

    .line 23
    .line 24
    invoke-static {p2, p3, v0, v1}, Lhf3;->c(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide p2

    .line 28
    const/4 p0, 0x0

    .line 29
    invoke-virtual {p1, p2, p3, p0, p4}, Leo5;->S(JFLgn2;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a(Lw03;)F
    .locals 0

    .line 1
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 2
    .line 3
    return p0
.end method

.method public abstract b()Lz24;
.end method

.method public abstract c()I
.end method

.method public final d(Leo5;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljy4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljy4;

    .line 6
    .line 7
    iget-boolean p0, p0, Ldo5;->X:Z

    .line 8
    .line 9
    invoke-interface {p1, p0}, Ljy4;->z(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
