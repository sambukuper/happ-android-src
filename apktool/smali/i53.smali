.class public final Li53;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lo53;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroid/util/Size;

    .line 2
    .line 3
    const/16 v1, 0x280

    .line 4
    .line 5
    const/16 v2, 0x1e0

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lpz2;->t0:Lpz2;

    .line 11
    .line 12
    new-instance v2, Lff6;

    .line 13
    .line 14
    sget-object v3, Lcb7;->b:Landroid/util/Size;

    .line 15
    .line 16
    invoke-direct {v2, v3}, Lff6;-><init>(Landroid/util/Size;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lef6;

    .line 20
    .line 21
    invoke-direct {v3, v1, v2}, Lef6;-><init>(Lpz2;Lff6;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lh53;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v1, v2}, Lh53;-><init>(B)V

    .line 28
    .line 29
    .line 30
    sget-object v4, Li63;->x:Lzx;

    .line 31
    .line 32
    iget-object v1, v1, Lh53;->Y:Lk05;

    .line 33
    .line 34
    invoke-virtual {v1, v4, v0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Ler8;->P:Lzx;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v1, v0, v4}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Li63;->s:Lzx;

    .line 48
    .line 49
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v0, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Li63;->A:Lzx;

    .line 57
    .line 58
    invoke-virtual {v1, v0, v3}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lpx1;->d:Lpx1;

    .line 62
    .line 63
    invoke-virtual {v0, v0}, Lpx1;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    sget-object v2, Le63;->r:Lzx;

    .line 70
    .line 71
    invoke-virtual {v1, v2, v0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Lo53;

    .line 75
    .line 76
    invoke-static {v1}, Lqd5;->c(Ll11;)Lqd5;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, Lo53;-><init>(Lqd5;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Li53;->a:Lo53;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_0
    const-string v0, "ImageAnalysis currently only supports SDR"

    .line 87
    .line 88
    invoke-static {v0}, Lu52;->k(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method
