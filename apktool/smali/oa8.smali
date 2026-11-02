.class public final Loa8;
.super Lqa8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public volatile transient h0:Z


# virtual methods
.method public final a()Lqa8;
    .locals 1

    .line 1
    invoke-super {p0}, Lqa8;->a()Lqa8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Loa8;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Loa8;->h0:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public final isFrozen()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Loa8;->h0:Z

    .line 2
    .line 3
    return p0
.end method
