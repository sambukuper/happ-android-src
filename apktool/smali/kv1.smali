.class public final Lkv1;
.super Lxu1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public L0:Llv1;

.field public M0:Z

.field public N0:Lsn2;

.field public O0:Lsn2;

.field public P0:Z


# virtual methods
.method public final c1(Lpi;Lwu1;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v3, p0, Lxu1;->s0:Lsd5;

    .line 2
    .line 3
    if-nez v3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v6, p0, Lkv1;->L0:Llv1;

    .line 7
    .line 8
    new-instance v0, Lpi;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x6

    .line 12
    move-object v2, p0

    .line 13
    move-object v1, p1

    .line 14
    invoke-direct/range {v0 .. v5}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v6, v0, p2}, Llv1;->i(Lpi;Lwu1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lc71;->X:Lc71;

    .line 22
    .line 23
    if-ne p0, p1, :cond_1

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 27
    .line 28
    return-object p0
.end method

.method public final h1(J)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lkv1;->N0:Lsn2;

    .line 6
    .line 7
    sget-object v1, Ljv1;->a:Liv1;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lqn0;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, p0, p1, p2, v2}, Lqn0;-><init>(Lkv1;JLq51;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    sget-object p1, Le71;->f0:Le71;

    .line 28
    .line 29
    invoke-static {v0, v2, p1, v1, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public final i1(Lhu1;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lkv1;->O0:Lsn2;

    .line 6
    .line 7
    sget-object v1, Ljv1;->b:Liv1;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v4, p0, Lxu1;->s0:Lsd5;

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lpi;

    .line 26
    .line 27
    const/4 v6, 0x7

    .line 28
    const/4 v5, 0x0

    .line 29
    move-object v2, p0

    .line 30
    move-object v3, p1

    .line 31
    invoke-direct/range {v1 .. v6}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    sget-object p1, Le71;->f0:Le71;

    .line 36
    .line 37
    invoke-static {v0, v5, p1, v1, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
.end method

.method public final q1()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lkv1;->M0:Z

    .line 2
    .line 3
    return p0
.end method
