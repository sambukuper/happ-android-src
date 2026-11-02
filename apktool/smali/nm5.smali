.class public final Lnm5;
.super Ljm5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Lmm5;

.field public h0:Ljava/lang/Object;

.field public i0:Z

.field public j0:I


# direct methods
.method public constructor <init>(Lmm5;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lmm5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p1, Lmm5;->f0:Lol5;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {p0, v0, v1, v2}, Ljm5;-><init>(Ljava/lang/Object;Ljava/util/Map;B)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lnm5;->g0:Lmm5;

    .line 10
    .line 11
    iget p1, v1, Lol5;->g0:I

    .line 12
    .line 13
    iput p1, p0, Lnm5;->j0:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lnm5;->g0:Lmm5;

    .line 2
    .line 3
    iget-object v0, v0, Lmm5;->f0:Lol5;

    .line 4
    .line 5
    iget v0, v0, Lol5;->g0:I

    .line 6
    .line 7
    iget v1, p0, Lnm5;->j0:I

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-super {p0}, Ljm5;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lnm5;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, p0, Lnm5;->i0:Z

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    invoke-static {}, Lbt;->c()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lnm5;->i0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnm5;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, p0, Lnm5;->g0:Lmm5;

    .line 8
    .line 9
    invoke-static {v1}, Lci8;->d(Ljava/lang/Object;)Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lnm5;->h0:Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lnm5;->i0:Z

    .line 21
    .line 22
    iget-object v0, v1, Lmm5;->f0:Lol5;

    .line 23
    .line 24
    iget v0, v0, Lol5;->g0:I

    .line 25
    .line 26
    iput v0, p0, Lnm5;->j0:I

    .line 27
    .line 28
    iget v0, p0, Ljm5;->f0:I

    .line 29
    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    .line 32
    iput v0, p0, Ljm5;->f0:I

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-static {}, Lio/sentry/c2;->g()V

    .line 36
    .line 37
    .line 38
    return-void
.end method
