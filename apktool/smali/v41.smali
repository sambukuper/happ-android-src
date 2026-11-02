.class public final Lv41;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lv41;",
        "Lqx4;",
        "Lw41;",
        "io.coil-kt.coil3_coil-compose-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final X:Lv63;

.field public final Y:Lv76;

.field public final Z:Lxu;

.field public final f0:Lgn2;

.field public final g0:Lq8;

.field public final h0:Lz41;

.field public final i0:Lev;

.field public final j0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lv63;Lv76;Lxu;Lgn2;Lq8;Lz41;Lev;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv41;->X:Lv63;

    .line 5
    .line 6
    iput-object p2, p0, Lv41;->Y:Lv76;

    .line 7
    .line 8
    iput-object p3, p0, Lv41;->Z:Lxu;

    .line 9
    .line 10
    iput-object p4, p0, Lv41;->f0:Lgn2;

    .line 11
    .line 12
    iput-object p5, p0, Lv41;->g0:Lq8;

    .line 13
    .line 14
    iput-object p6, p0, Lv41;->h0:Lz41;

    .line 15
    .line 16
    iput-object p7, p0, Lv41;->i0:Lev;

    .line 17
    .line 18
    iput-object p8, p0, Lv41;->j0:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 10

    .line 1
    new-instance v0, Lyu;

    .line 2
    .line 3
    iget-object v1, p0, Lv41;->Z:Lxu;

    .line 4
    .line 5
    iget-object v2, p0, Lv41;->X:Lv63;

    .line 6
    .line 7
    iget-object v3, p0, Lv41;->Y:Lv76;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lyu;-><init>(Lxu;Lv63;Lv76;)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lcoil3/compose/AsyncImagePainter;

    .line 13
    .line 14
    invoke-direct {v5, v0}, Lcoil3/compose/AsyncImagePainter;-><init>(Lyu;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lv41;->f0:Lgn2;

    .line 18
    .line 19
    iput-object v1, v5, Lcoil3/compose/AsyncImagePainter;->o0:Lgn2;

    .line 20
    .line 21
    iget-object v1, p0, Lv41;->h0:Lz41;

    .line 22
    .line 23
    iput-object v1, v5, Lcoil3/compose/AsyncImagePainter;->p0:Lz41;

    .line 24
    .line 25
    iget-object v1, p0, Lv41;->i0:Lev;

    .line 26
    .line 27
    iput-object v1, v5, Lcoil3/compose/AsyncImagePainter;->q0:Lev;

    .line 28
    .line 29
    invoke-virtual {v5, v0}, Lcoil3/compose/AsyncImagePainter;->l(Lyu;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v2, Lv63;->o:Lab7;

    .line 33
    .line 34
    instance-of v1, v0, Lu31;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    check-cast v0, Lu31;

    .line 39
    .line 40
    :goto_0
    move-object v9, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    goto :goto_0

    .line 44
    :goto_1
    new-instance v4, Lw41;

    .line 45
    .line 46
    iget-object v6, p0, Lv41;->g0:Lq8;

    .line 47
    .line 48
    iget-object v7, p0, Lv41;->h0:Lz41;

    .line 49
    .line 50
    iget-object v8, p0, Lv41;->j0:Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct/range {v4 .. v9}, Lw41;-><init>(Lcoil3/compose/AsyncImagePainter;Lq8;Lz41;Ljava/lang/String;Lu31;)V

    .line 53
    .line 54
    .line 55
    return-object v4
.end method

.method public final c(Ljx4;)V
    .locals 8

    .line 1
    check-cast p1, Lw41;

    .line 2
    .line 3
    iget-object v0, p1, Lw41;->w0:Lcoil3/compose/AsyncImagePainter;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcoil3/compose/AsyncImagePainter;->h()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-object v2, p1, Lw41;->v0:Lu31;

    .line 10
    .line 11
    new-instance v3, Lyu;

    .line 12
    .line 13
    iget-object v4, p0, Lv41;->Z:Lxu;

    .line 14
    .line 15
    iget-object v5, p0, Lv41;->X:Lv63;

    .line 16
    .line 17
    iget-object v6, p0, Lv41;->Y:Lv76;

    .line 18
    .line 19
    invoke-direct {v3, v4, v5, v6}, Lyu;-><init>(Lxu;Lv63;Lv76;)V

    .line 20
    .line 21
    .line 22
    iget-object v4, p1, Lw41;->w0:Lcoil3/compose/AsyncImagePainter;

    .line 23
    .line 24
    iget-object v6, p0, Lv41;->f0:Lgn2;

    .line 25
    .line 26
    iput-object v6, v4, Lcoil3/compose/AsyncImagePainter;->o0:Lgn2;

    .line 27
    .line 28
    iget-object v6, p0, Lv41;->h0:Lz41;

    .line 29
    .line 30
    iput-object v6, v4, Lcoil3/compose/AsyncImagePainter;->p0:Lz41;

    .line 31
    .line 32
    iget-object v7, p0, Lv41;->i0:Lev;

    .line 33
    .line 34
    iput-object v7, v4, Lcoil3/compose/AsyncImagePainter;->q0:Lev;

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Lcoil3/compose/AsyncImagePainter;->l(Lyu;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Lcoil3/compose/AsyncImagePainter;->h()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-static {v0, v1, v3, v4}, Lua7;->a(JJ)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v1, p0, Lv41;->g0:Lq8;

    .line 48
    .line 49
    iput-object v1, p1, Lw41;->q0:Lq8;

    .line 50
    .line 51
    iget-object v1, v5, Lv63;->o:Lab7;

    .line 52
    .line 53
    instance-of v3, v1, Lu31;

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    check-cast v1, Lu31;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v1, 0x0

    .line 61
    :goto_0
    iput-object v1, p1, Lw41;->v0:Lu31;

    .line 62
    .line 63
    iput-object v6, p1, Lw41;->r0:Lz41;

    .line 64
    .line 65
    const/high16 v1, 0x3f800000    # 1.0f

    .line 66
    .line 67
    iput v1, p1, Lw41;->s0:F

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    iput-boolean v1, p1, Lw41;->t0:Z

    .line 71
    .line 72
    iget-object v1, p1, Lw41;->u0:Ljava/lang/String;

    .line 73
    .line 74
    iget-object p0, p0, Lv41;->j0:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v1, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_1

    .line 81
    .line 82
    iput-object p0, p1, Lw41;->u0:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {p1}, Lch3;->I(Lw07;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    iget-object p0, p1, Lw41;->v0:Lu31;

    .line 88
    .line 89
    invoke-static {v2, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    if-nez p0, :cond_3

    .line 96
    .line 97
    :cond_2
    invoke-static {p1}, Lnr4;->E(Lg34;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-static {p1}, Lz68;->W(Lrv1;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lv41;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    check-cast p1, Lv41;

    .line 12
    .line 13
    iget-object v0, p0, Lv41;->X:Lv63;

    .line 14
    .line 15
    iget-object v2, p1, Lv41;->X:Lv63;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lv63;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, Lv41;->Y:Lv76;

    .line 25
    .line 26
    iget-object v2, p1, Lv41;->Y:Lv76;

    .line 27
    .line 28
    if-eq v0, v2, :cond_3

    .line 29
    .line 30
    return v1

    .line 31
    :cond_3
    iget-object v0, p0, Lv41;->Z:Lxu;

    .line 32
    .line 33
    iget-object v2, p1, Lv41;->Z:Lxu;

    .line 34
    .line 35
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-object v0, p0, Lv41;->f0:Lgn2;

    .line 43
    .line 44
    iget-object v2, p1, Lv41;->f0:Lgn2;

    .line 45
    .line 46
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-object v0, p0, Lv41;->g0:Lq8;

    .line 54
    .line 55
    iget-object v2, p1, Lv41;->g0:Lq8;

    .line 56
    .line 57
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-object v0, p0, Lv41;->h0:Lz41;

    .line 65
    .line 66
    iget-object v2, p1, Lv41;->h0:Lz41;

    .line 67
    .line 68
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_7

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 76
    .line 77
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget-object v0, p0, Lv41;->i0:Lev;

    .line 85
    .line 86
    iget-object v2, p1, Lv41;->i0:Lev;

    .line 87
    .line 88
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_9

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_9
    iget-object p0, p0, Lv41;->j0:Ljava/lang/String;

    .line 96
    .line 97
    iget-object p1, p1, Lv41;->j0:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-nez p0, :cond_a

    .line 104
    .line 105
    :goto_0
    return v1

    .line 106
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 107
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lv41;->X:Lv63;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv63;->hashCode()I

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
    iget-object v2, p0, Lv41;->Y:Lv76;

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
    iget-object v0, p0, Lv41;->Z:Lxu;

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
    iget-object v2, p0, Lv41;->f0:Lgn2;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    const/16 v0, 0x3c1

    .line 34
    .line 35
    mul-int/2addr v2, v0

    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-static {v3, v2, v1}, Loi0;->e(III)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v4, p0, Lv41;->g0:Lq8;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    add-int/2addr v4, v2

    .line 48
    mul-int/2addr v4, v1

    .line 49
    iget-object v2, p0, Lv41;->h0:Lz41;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    add-int/2addr v2, v4

    .line 56
    mul-int/2addr v2, v1

    .line 57
    const/high16 v4, 0x3f800000    # 1.0f

    .line 58
    .line 59
    invoke-static {v2, v4, v0}, Lpc6;->d(IFI)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v0, v1, v3}, Lpc6;->f(IIZ)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v2, 0x0

    .line 68
    iget-object v3, p0, Lv41;->i0:Lev;

    .line 69
    .line 70
    if-nez v3, :cond_0

    .line 71
    .line 72
    move v3, v2

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    :goto_0
    add-int/2addr v0, v3

    .line 79
    mul-int/2addr v0, v1

    .line 80
    iget-object p0, p0, Lv41;->j0:Ljava/lang/String;

    .line 81
    .line 82
    if-nez p0, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :goto_1
    add-int/2addr v0, v2

    .line 90
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ContentPainterElement(request="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lv41;->X:Lv63;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", imageLoader="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lv41;->Y:Lv76;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", modelEqualityDelegate="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lv41;->Z:Lxu;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", transform="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lv41;->f0:Lgn2;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", onState=null, filterQuality=Low, alignment="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lv41;->g0:Lq8;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", contentScale="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lv41;->h0:Lz41;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", alpha=1.0, colorFilter=null, clipToBounds=true, previewHandler="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lv41;->i0:Lev;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", contentDescription="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lv41;->j0:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p0, ")"

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method
