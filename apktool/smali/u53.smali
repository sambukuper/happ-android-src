.class public final Lu53;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ly53;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Ljl7;->g0:Ljl7;

    .line 2
    .line 3
    sget-object v1, Lpz2;->t0:Lpz2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    sget-object v3, Lff6;->c:Lff6;

    .line 11
    .line 12
    new-instance v4, Lef6;

    .line 13
    .line 14
    invoke-direct {v4, v1, v3}, Lef6;-><init>(Lpz2;Lff6;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lh53;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v1, v3}, Lh53;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sget-object v3, Ler8;->P:Lzx;

    .line 24
    .line 25
    const/4 v5, 0x4

    .line 26
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-object v1, v1, Lh53;->Y:Lk05;

    .line 31
    .line 32
    invoke-virtual {v1, v3, v5}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object v3, Ler8;->e0:Lzx;

    .line 36
    .line 37
    invoke-virtual {v1, v3, v0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Li63;->s:Lzx;

    .line 41
    .line 42
    invoke-virtual {v1, v0, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Li63;->A:Lzx;

    .line 46
    .line 47
    invoke-virtual {v1, v0, v4}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Ly53;->g0:Lzx;

    .line 51
    .line 52
    invoke-virtual {v1, v0, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Le63;->r:Lzx;

    .line 56
    .line 57
    sget-object v2, Lpx1;->d:Lpx1;

    .line 58
    .line 59
    invoke-virtual {v1, v0, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Ly53;

    .line 63
    .line 64
    invoke-static {v1}, Lqd5;->c(Ll11;)Lqd5;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-direct {v0, v1}, Ly53;-><init>(Lqd5;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lu53;->a:Ly53;

    .line 72
    .line 73
    return-void
.end method
