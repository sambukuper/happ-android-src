.class public final Ljt5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lmt5;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lpz2;->t0:Lpz2;

    .line 2
    .line 3
    sget-object v1, Lff6;->c:Lff6;

    .line 4
    .line 5
    new-instance v2, Lef6;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Lef6;-><init>(Lpz2;Lff6;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lh53;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, v1}, Lh53;-><init>(B)V

    .line 14
    .line 15
    .line 16
    sget-object v3, Ler8;->P:Lzx;

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v0, v0, Lh53;->Y:Lk05;

    .line 23
    .line 24
    invoke-virtual {v0, v3, v1}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Li63;->s:Lzx;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v1, v3}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Li63;->A:Lzx;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object v1, Ler8;->V:Lzx;

    .line 43
    .line 44
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object v1, Le63;->r:Lzx;

    .line 50
    .line 51
    sget-object v2, Lpx1;->c:Lpx1;

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Lmt5;

    .line 57
    .line 58
    invoke-static {v0}, Lqd5;->c(Ll11;)Lqd5;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-direct {v1, v0}, Lmt5;-><init>(Lqd5;)V

    .line 63
    .line 64
    .line 65
    sput-object v1, Ljt5;->a:Lmt5;

    .line 66
    .line 67
    return-void
.end method
