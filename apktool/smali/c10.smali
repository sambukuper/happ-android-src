.class public final Lc10;
.super Lwl7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public g:Lox4;


# virtual methods
.method public final C(Lr06;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc10;->g:Lox4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lbh1;->a:Lr06;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p1, "Check failed."

    .line 12
    .line 13
    invoke-static {p1}, Lwc3;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object p0, p0, Lc10;->g:Lox4;

    .line 17
    .line 18
    iget-object p0, p0, Lox4;->m0:Lzi1;

    .line 19
    .line 20
    invoke-virtual {p0}, Lzi1;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final v(Lr06;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lc10;->g:Lox4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lbh1;->a:Lr06;

    .line 7
    .line 8
    if-ne p1, p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method
