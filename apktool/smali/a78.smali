.class public final La78;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "La78;",
        "Lqx4;",
        "Lb78;",
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
.field public final X:Ly78;

.field public final Y:Lkd8;

.field public final Z:Lo88;

.field public final f0:Z

.field public final g0:Lwx3;


# direct methods
.method public constructor <init>(Ly78;Lkd8;Lo88;ZLwx3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La78;->X:Ly78;

    .line 5
    .line 6
    iput-object p2, p0, La78;->Y:Lkd8;

    .line 7
    .line 8
    iput-object p3, p0, La78;->Z:Lo88;

    .line 9
    .line 10
    iput-boolean p4, p0, La78;->f0:Z

    .line 11
    .line 12
    iput-object p5, p0, La78;->g0:Lwx3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 6

    .line 1
    new-instance v0, Lb78;

    .line 2
    .line 3
    iget-boolean v4, p0, La78;->f0:Z

    .line 4
    .line 5
    iget-object v5, p0, La78;->g0:Lwx3;

    .line 6
    .line 7
    iget-object v1, p0, La78;->X:Ly78;

    .line 8
    .line 9
    iget-object v2, p0, La78;->Y:Lkd8;

    .line 10
    .line 11
    iget-object v3, p0, La78;->Z:Lo88;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lb78;-><init>(Ly78;Lkd8;Lo88;ZLwx3;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 9

    .line 1
    check-cast p1, Lb78;

    .line 2
    .line 3
    iget-object v0, p1, Lb78;->s0:Ly78;

    .line 4
    .line 5
    iget-object v1, p0, La78;->X:Ly78;

    .line 6
    .line 7
    iput-object v1, p1, Lb78;->s0:Ly78;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-boolean v5, p0, La78;->f0:Z

    .line 13
    .line 14
    iput-boolean v5, p1, Lb78;->t0:Z

    .line 15
    .line 16
    xor-int/lit8 v6, v5, 0x1

    .line 17
    .line 18
    iget-object v8, v1, Ly78;->a:Lu58;

    .line 19
    .line 20
    new-instance v2, Lt58;

    .line 21
    .line 22
    iget-object v3, p0, La78;->g0:Lwx3;

    .line 23
    .line 24
    iget v3, v3, Lwx3;->c:I

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    if-ne v3, v4, :cond_0

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    :goto_0
    move v7, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/4 v3, 0x0

    .line 33
    goto :goto_0

    .line 34
    :goto_1
    iget-object v3, p0, La78;->Y:Lkd8;

    .line 35
    .line 36
    iget-object v4, p0, La78;->Z:Lo88;

    .line 37
    .line 38
    invoke-direct/range {v2 .. v7}, Lt58;-><init>(Lkd8;Lo88;ZZZ)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v8, Lu58;->X:Lrh5;

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_2

    .line 51
    .line 52
    iget-object p0, p1, Lb78;->u0:Lr80;

    .line 53
    .line 54
    iget-object p1, v1, Ly78;->g:Lq80;

    .line 55
    .line 56
    iget-object v0, p0, Lr80;->q0:Lq80;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, Lq80;->a:Lc15;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Lc15;->j(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object v0, p1, Lq80;->a:Lc15;

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Lc15;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lr80;->q0:Lq80;

    .line 71
    .line 72
    :cond_2
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La78;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La78;

    .line 10
    .line 11
    iget-boolean v0, p1, La78;->f0:Z

    .line 12
    .line 13
    iget-boolean v1, p0, La78;->f0:Z

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La78;->X:Ly78;

    .line 19
    .line 20
    iget-object v1, p1, La78;->X:Ly78;

    .line 21
    .line 22
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La78;->Y:Lkd8;

    .line 30
    .line 31
    iget-object v1, p1, La78;->Y:Lkd8;

    .line 32
    .line 33
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, La78;->Z:Lo88;

    .line 41
    .line 42
    iget-object v1, p1, La78;->Z:Lo88;

    .line 43
    .line 44
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-object p0, p0, La78;->g0:Lwx3;

    .line 52
    .line 53
    iget-object p1, p1, La78;->g0:Lwx3;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lwx3;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    :goto_0
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 64
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La78;->f0:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La78;->X:Ly78;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, La78;->Y:Lkd8;

    .line 19
    .line 20
    invoke-virtual {v0}, Lkd8;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, La78;->Z:Lo88;

    .line 28
    .line 29
    const/16 v2, 0x3c1

    .line 30
    .line 31
    invoke-static {v1, v0, v2}, Lpc6;->g(Lo88;II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object p0, p0, La78;->g0:Lwx3;

    .line 36
    .line 37
    invoke-virtual {p0}, Lwx3;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/2addr p0, v0

    .line 42
    return p0
.end method
