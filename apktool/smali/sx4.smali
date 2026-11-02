.class public abstract Lsx4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lbt0;
.implements Lpt0;


# virtual methods
.method public B()Ljava/util/Collection;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x10

    .line 7
    .line 8
    invoke-static {p0}, Lq22;->z0(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public abstract X()Laa7;
.end method

.method public e()Lfl1;
    .locals 0

    .line 1
    sget-object p0, Lgl1;->e:Lfl1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x11

    .line 7
    .line 8
    invoke-static {p0}, Lms0;->z0(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public f0()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 p0, 0x6

    .line 7
    invoke-static {p0}, Lm0;->z0(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    throw p0
.end method

.method public g0()Lus0;
    .locals 0

    .line 1
    sget-object p0, Lus0;->f0:Lus0;

    .line 2
    .line 3
    return-object p0
.end method

.method public i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public k0()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x12

    .line 7
    .line 8
    invoke-static {p0}, Lms0;->z0(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public abstract l0(Lui8;)Let4;
.end method

.method public m()Lfx4;
    .locals 0

    .line 1
    sget-object p0, Lfx4;->Y:Lfx4;

    .line 2
    .line 3
    return-object p0
.end method

.method public m0(Lui8;Lz14;)Let4;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lui8;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lsx4;->s0(Lz14;)Let4;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/16 p0, 0xc

    .line 15
    .line 16
    invoke-static {p0}, Lm0;->z0(I)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0

    .line 21
    :cond_1
    new-instance v0, Lwi8;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lwi8;-><init>(Lui8;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Lfw7;

    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lsx4;->s0(Lz14;)Let4;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p1, p0, v0}, Lfw7;-><init>(Let4;Lwi8;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public n0()Lsx4;
    .locals 0

    .line 1
    return-object p0
.end method

.method public o0()Let4;
    .locals 0

    .line 1
    sget-object p0, Ldt4;->b:Ldt4;

    .line 2
    .line 3
    return-object p0
.end method

.method public p0()Li44;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public abstract q0()Let4;
.end method

.method public r0()Let4;
    .locals 1

    .line 1
    invoke-static {p0}, Lbl1;->c(Led1;)Lvx4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lel1;->h(Lvx4;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lz14;->t:Lz14;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lsx4;->s0(Lz14;)Let4;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/16 p0, 0x11

    .line 18
    .line 19
    invoke-static {p0}, Lm0;->z0(I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public s0(Lz14;)Let4;
    .locals 0

    .line 1
    sget-object p0, Ldt4;->b:Ldt4;

    .line 2
    .line 3
    return-object p0
.end method

.method public t0()Lgs0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public u0()Lft8;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public v0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public w0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public y0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
