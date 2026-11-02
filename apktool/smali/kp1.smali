.class public final Lkp1;
.super Lwj2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public final sink(Loi5;Z)Lsa7;
    .locals 1

    .line 1
    invoke-virtual {p1}, Loi5;->c()Loi5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ls92;->createDirectories(Loi5;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Lwj2;->sink(Loi5;Z)Lsa7;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
