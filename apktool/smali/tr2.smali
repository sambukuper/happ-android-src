.class public final Ltr2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lqd1;


# virtual methods
.method public final a(Lle7;Lpd5;)Lsd1;
    .locals 3

    .line 1
    iget-object p0, p1, Lle7;->a:Ld73;

    .line 2
    .line 3
    invoke-interface {p0}, Ld73;->source()Lba0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lpd1;->b:Lkb0;

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    invoke-interface {p0, v1, v2, v0}, Lba0;->q(JLkb0;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget-object v0, Lpd1;->a:Lkb0;

    .line 18
    .line 19
    invoke-interface {p0, v1, v2, v0}, Lba0;->q(JLkb0;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    :goto_0
    new-instance p0, Lur2;

    .line 29
    .line 30
    iget-object p1, p1, Lle7;->a:Ld73;

    .line 31
    .line 32
    invoke-direct {p0, p1, p2}, Lur2;-><init>(Ld73;Lpd5;)V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method
