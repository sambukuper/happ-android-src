.class public final Lp33;
.super Lr33;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public i:Ljava/lang/String;


# virtual methods
.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lp33;->i:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lr33;->b:Lfu6;

    .line 7
    .line 8
    iget-object v0, v0, Lfu6;->h0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lz33;

    .line 11
    .line 12
    iget p0, p0, Lr33;->e:I

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lz33;->g(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final p()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
