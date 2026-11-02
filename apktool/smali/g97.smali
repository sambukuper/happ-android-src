.class public final Lg97;
.super Lw39;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final i0:Lzk;

.field public final j0:Z

.field public final k0:Lz47;

.field public final l0:Lkm;

.field public final m0:Z


# direct methods
.method public constructor <init>(Lzk;ZLz47;Lkm;Z)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lg97;->i0:Lzk;

    .line 8
    .line 9
    iput-boolean p2, p0, Lg97;->j0:Z

    .line 10
    .line 11
    iput-object p3, p0, Lg97;->k0:Lz47;

    .line 12
    .line 13
    iput-object p4, p0, Lg97;->l0:Lkm;

    .line 14
    .line 15
    iput-boolean p5, p0, Lg97;->m0:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final A()Le0;
    .locals 0

    .line 1
    iget-object p0, p0, Lg97;->k0:Lz47;

    .line 2
    .line 3
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lc6;

    .line 6
    .line 7
    iget-object p0, p0, Lc6;->p0:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lmm;

    .line 10
    .line 11
    return-object p0
.end method

.method public final B(Lx14;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lt14;

    .line 5
    .line 6
    invoke-virtual {p1}, Lt14;->getAnnotations()Lsm;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final E()Ljava/lang/Iterable;
    .locals 0

    .line 1
    iget-object p0, p0, Lg97;->i0:Lzk;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lzk;->getAnnotations()Lsm;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ld02;->X:Ld02;

    .line 13
    .line 14
    return-object p0
.end method

.method public final F()Lkm;
    .locals 0

    .line 1
    iget-object p0, p0, Lg97;->l0:Lkm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final G()Lrl3;
    .locals 0

    .line 1
    iget-object p0, p0, Lg97;->k0:Lz47;

    .line 2
    .line 3
    iget-object p0, p0, Lz47;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lg44;

    .line 6
    .line 7
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lrl3;

    .line 12
    .line 13
    return-object p0
.end method

.method public final H()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lg97;->i0:Lzk;

    .line 2
    .line 3
    instance-of v0, p0, Lot8;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lot8;

    .line 8
    .line 9
    iget-object p0, p0, Lot8;->n0:Lt14;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final I(Lg39;Lbk3;)Lg39;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    const/4 p2, 0x2

    .line 5
    sget-object v0, Lh75;->Z:Lh75;

    .line 6
    .line 7
    invoke-static {p1, v0, p0, p2}, Lg39;->a(Lg39;Ljava/lang/Object;ZI)Lg39;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-object p0, p2, Lbk3;->a:Lg39;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final K()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lg97;->k0:Lz47;

    .line 2
    .line 3
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public final L(Lx14;)Lx14;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lt14;

    .line 5
    .line 6
    invoke-static {p1}, Lc18;->e(Lt14;)Lt14;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final M(Lzk6;)Lgk2;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lt14;

    .line 5
    .line 6
    sget-object p0, Lcj8;->a:Lq32;

    .line 7
    .line 8
    invoke-virtual {p1}, Lt14;->n0()Llh8;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Llh8;->x()Lot0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    instance-of p1, p0, Lsx4;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    check-cast p0, Lsx4;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p0, v0

    .line 25
    :goto_0
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, Lbl1;->f(Led1;)Lgk2;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    return-object v0
.end method

.method public final R()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lg97;->m0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic T()Lxi8;
    .locals 0

    .line 1
    sget-object p0, Llh4;->E0:Llh4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final V()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lg97;->j0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final W(Lx14;Lx14;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lg97;->k0:Lz47;

    .line 8
    .line 9
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lc6;

    .line 12
    .line 13
    iget-object p0, p0, Lc6;->Z:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lp45;

    .line 16
    .line 17
    check-cast p1, Lt14;

    .line 18
    .line 19
    check-cast p2, Lt14;

    .line 20
    .line 21
    check-cast p0, Lq45;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lq45;->a(Lt14;Lt14;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public final Y()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Z(Lx14;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lt14;

    .line 5
    .line 6
    invoke-virtual {p1}, Lt14;->q0()Lmo8;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p0, p0, Lj65;

    .line 11
    .line 12
    return p0
.end method

.method public final x(Ljava/lang/Object;Lx14;)Z
    .locals 2

    .line 1
    check-cast p1, Lgm;

    .line 2
    .line 3
    instance-of v0, p1, Lm44;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lg97;->K()Z

    .line 8
    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Lm44;

    .line 12
    .line 13
    iget-boolean v0, v0, Lm44;->g:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lg97;->l0:Lkm;

    .line 18
    .line 19
    sget-object v1, Lkm;->h0:Lkm;

    .line 20
    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    :cond_0
    if-eqz p2, :cond_2

    .line 24
    .line 25
    check-cast p2, Lt14;

    .line 26
    .line 27
    invoke-static {p2}, Lzz3;->G(Lt14;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Lg97;->k0:Lz47;

    .line 34
    .line 35
    iget-object p2, p0, Lz47;->Y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, Lc6;

    .line 38
    .line 39
    iget-object p2, p2, Lc6;->p0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p2, Lmm;

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Le0;->i(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 50
    .line 51
    :cond_1
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_2
    const/4 p0, 0x0

    .line 54
    return p0
.end method
