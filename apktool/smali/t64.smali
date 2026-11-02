.class final Lt64;
.super Lqx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lqx4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lt64;",
        "Lqx4;",
        "Lw64;",
        "foundation"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final X:Ldn2;

.field public final Y:Ls64;

.field public final Z:Lsd5;

.field public final f0:Z


# direct methods
.method public constructor <init>(Ldn2;Ls64;Lsd5;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt64;->X:Ldn2;

    .line 5
    .line 6
    iput-object p2, p0, Lt64;->Y:Ls64;

    .line 7
    .line 8
    iput-object p3, p0, Lt64;->Z:Lsd5;

    .line 9
    .line 10
    iput-boolean p4, p0, Lt64;->f0:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 4

    .line 1
    new-instance v0, Lw64;

    .line 2
    .line 3
    iget-object v1, p0, Lt64;->Z:Lsd5;

    .line 4
    .line 5
    iget-boolean v2, p0, Lt64;->f0:Z

    .line 6
    .line 7
    iget-object v3, p0, Lt64;->X:Ldn2;

    .line 8
    .line 9
    iget-object p0, p0, Lt64;->Y:Ls64;

    .line 10
    .line 11
    invoke-direct {v0, v3, p0, v1, v2}, Lw64;-><init>(Ldn2;Ls64;Lsd5;Z)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 2

    .line 1
    check-cast p1, Lw64;

    .line 2
    .line 3
    iget-object v0, p0, Lt64;->X:Ldn2;

    .line 4
    .line 5
    iput-object v0, p1, Lw64;->q0:Ldn2;

    .line 6
    .line 7
    iget-object v0, p0, Lt64;->Y:Ls64;

    .line 8
    .line 9
    iput-object v0, p1, Lw64;->r0:Ls64;

    .line 10
    .line 11
    iget-object v0, p1, Lw64;->s0:Lsd5;

    .line 12
    .line 13
    iget-object v1, p0, Lt64;->Z:Lsd5;

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    iput-object v1, p1, Lw64;->s0:Lsd5;

    .line 18
    .line 19
    invoke-static {p1}, Lch3;->I(Lw07;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-boolean v0, p1, Lw64;->t0:Z

    .line 23
    .line 24
    iget-boolean p0, p0, Lt64;->f0:Z

    .line 25
    .line 26
    if-ne v0, p0, :cond_1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iput-boolean p0, p1, Lw64;->t0:Z

    .line 30
    .line 31
    invoke-virtual {p1}, Lw64;->Y0()V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lch3;->I(Lw07;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lt64;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lt64;

    .line 11
    .line 12
    iget-object v1, p1, Lt64;->X:Ldn2;

    .line 13
    .line 14
    iget-object v2, p0, Lt64;->X:Ldn2;

    .line 15
    .line 16
    if-eq v2, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-object v1, p0, Lt64;->Y:Ls64;

    .line 20
    .line 21
    iget-object v2, p1, Lt64;->Y:Ls64;

    .line 22
    .line 23
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v1, p0, Lt64;->Z:Lsd5;

    .line 31
    .line 32
    iget-object v2, p1, Lt64;->Z:Lsd5;

    .line 33
    .line 34
    if-eq v1, v2, :cond_4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    iget-boolean p0, p0, Lt64;->f0:Z

    .line 38
    .line 39
    iget-boolean p1, p1, Lt64;->f0:Z

    .line 40
    .line 41
    if-eq p0, p1, :cond_5

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lt64;->X:Ldn2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lt64;->Y:Ls64;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lt64;->Z:Lsd5;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-boolean p0, p0, Lt64;->f0:Z

    .line 27
    .line 28
    invoke-static {v0, v1, p0}, Lpc6;->f(IIZ)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, p0

    .line 38
    return v0
.end method
