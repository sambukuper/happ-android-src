.class public final Lg50;
.super Lh50;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh50;->j0:Lwg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lro3;->m(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, p1, p2, p3, v0}, Lh50;->p(Ljava/lang/Object;Lro3;Lt37;Z)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p2, p1}, Lro3;->a1(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lh50;->h0:Ljava/lang/Object;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2, p3}, Lh50;->u(Ljava/lang/Object;Lro3;Lt37;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lro3;->J()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lh50;->v(Ljava/lang/Object;Lro3;Lt37;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public final g(Lc25;)Lar3;
    .locals 1

    .line 1
    new-instance v0, Loo8;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Loo8;-><init>(Lh50;Lc25;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final i(Ljava/util/Set;)Lar3;
    .locals 2

    .line 1
    new-instance v0, Lg50;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lh50;-><init>(Lh50;Ljava/util/Set;Ljava/util/Set;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final r()Lh50;
    .locals 1

    .line 1
    iget-object v0, p0, Lh50;->j0:Lwg;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh50;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lc50;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lc50;-><init>(Lg50;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Llj7;->X:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "BeanSerializer for "

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final z([Lf50;[Lf50;)Lh50;
    .locals 1

    .line 1
    new-instance v0, Lg50;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lh50;-><init>(Lh50;[Lf50;[Lf50;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
