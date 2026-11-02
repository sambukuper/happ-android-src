.class public final synthetic Lkw6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Leo5;

.field public final synthetic Y:Leo5;

.field public final synthetic Z:Leo5;

.field public final synthetic f0:I

.field public final synthetic g0:Lv09;

.field public final synthetic h0:Lwp7;

.field public final synthetic i0:I

.field public final synthetic j0:I

.field public final synthetic k0:Leo5;

.field public final synthetic l0:Lrb0;

.field public final synthetic m0:Leo5;

.field public final synthetic n0:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Leo5;Leo5;Leo5;ILv09;Lwp7;IILeo5;Lrb0;Leo5;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkw6;->X:Leo5;

    .line 5
    .line 6
    iput-object p2, p0, Lkw6;->Y:Leo5;

    .line 7
    .line 8
    iput-object p3, p0, Lkw6;->Z:Leo5;

    .line 9
    .line 10
    iput p4, p0, Lkw6;->f0:I

    .line 11
    .line 12
    iput-object p5, p0, Lkw6;->g0:Lv09;

    .line 13
    .line 14
    iput-object p6, p0, Lkw6;->h0:Lwp7;

    .line 15
    .line 16
    iput p7, p0, Lkw6;->i0:I

    .line 17
    .line 18
    iput p8, p0, Lkw6;->j0:I

    .line 19
    .line 20
    iput-object p9, p0, Lkw6;->k0:Leo5;

    .line 21
    .line 22
    iput-object p10, p0, Lkw6;->l0:Lrb0;

    .line 23
    .line 24
    iput-object p11, p0, Lkw6;->m0:Leo5;

    .line 25
    .line 26
    iput-object p12, p0, Lkw6;->n0:Ljava/lang/Integer;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ldo5;

    .line 2
    .line 3
    iget-object v0, p0, Lkw6;->X:Leo5;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, v0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lkw6;->Y:Leo5;

    .line 10
    .line 11
    invoke-static {p1, v0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lkw6;->Z:Leo5;

    .line 15
    .line 16
    iget v2, v0, Leo5;->X:I

    .line 17
    .line 18
    iget v3, p0, Lkw6;->f0:I

    .line 19
    .line 20
    sub-int/2addr v3, v2

    .line 21
    iget-object v2, p0, Lkw6;->h0:Lwp7;

    .line 22
    .line 23
    invoke-interface {v2}, Lug3;->getLayoutDirection()Lz24;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, p0, Lkw6;->g0:Lv09;

    .line 28
    .line 29
    invoke-interface {v5, v2, v4}, Lv09;->d(Lfi1;Lz24;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    add-int/2addr v4, v3

    .line 34
    invoke-interface {v2}, Lug3;->getLayoutDirection()Lz24;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v5, v2, v3}, Lv09;->b(Lfi1;Lz24;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sub-int/2addr v4, v2

    .line 43
    div-int/lit8 v4, v4, 0x2

    .line 44
    .line 45
    iget v2, p0, Lkw6;->i0:I

    .line 46
    .line 47
    iget v3, p0, Lkw6;->j0:I

    .line 48
    .line 49
    sub-int v3, v2, v3

    .line 50
    .line 51
    invoke-static {p1, v0, v4, v3}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lkw6;->k0:Leo5;

    .line 55
    .line 56
    iget v3, v0, Leo5;->Y:I

    .line 57
    .line 58
    sub-int v3, v2, v3

    .line 59
    .line 60
    invoke-static {p1, v0, v1, v3}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lkw6;->l0:Lrb0;

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    iget v0, v0, Lrb0;->a:I

    .line 68
    .line 69
    iget-object v1, p0, Lkw6;->n0:Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    sub-int/2addr v2, v1

    .line 79
    iget-object p0, p0, Lkw6;->m0:Leo5;

    .line 80
    .line 81
    invoke-static {p1, p0, v0, v2}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 82
    .line 83
    .line 84
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 85
    .line 86
    return-object p0
.end method
