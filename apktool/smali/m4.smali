.class public abstract Lm4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lkx4;

.field public static final b:Lkx4;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ll4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll4;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lhx4;->X:Lhx4;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lz68;->q0(Lkx4;Lsn2;)Lkx4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v2, Ly2;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ly2;-><init>(B)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v3, v2}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/high16 v2, 0x41200000    # 10.0f

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-static {v0, v2, v4, v5}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lm4;->a:Lkx4;

    .line 32
    .line 33
    new-instance v0, Ll4;

    .line 34
    .line 35
    invoke-direct {v0, v3}, Ll4;-><init>(B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v0}, Lz68;->q0(Lkx4;Lsn2;)Lkx4;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Ly2;

    .line 43
    .line 44
    invoke-direct {v1, v5}, Ly2;-><init>(B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v3, v1}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0, v4, v2, v3}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lm4;->b:Lkx4;

    .line 56
    .line 57
    return-void
.end method
