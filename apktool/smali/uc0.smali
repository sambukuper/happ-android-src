.class public abstract Luc0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lmj0;

.field public static final b:Lmj0;

.field public static final c:Lmj0;

.field public static final d:Lmj0;

.field public static final e:Lmj0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lag;->h0:Lag;

    .line 2
    .line 3
    sget v1, Lgc0;->a:I

    .line 4
    .line 5
    new-instance v1, Lmj0;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lmj0;-><init>(Lgn2;)V

    .line 8
    .line 9
    .line 10
    sput-object v1, Luc0;->a:Lmj0;

    .line 11
    .line 12
    sget-object v0, Lag;->i0:Lag;

    .line 13
    .line 14
    new-instance v1, Lmj0;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lmj0;-><init>(Lgn2;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Luc0;->b:Lmj0;

    .line 20
    .line 21
    sget-object v0, Lag;->j0:Lag;

    .line 22
    .line 23
    new-instance v1, Lmj0;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lmj0;-><init>(Lgn2;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Luc0;->c:Lmj0;

    .line 29
    .line 30
    sget-object v0, Lag;->k0:Lag;

    .line 31
    .line 32
    new-instance v1, Lmj0;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Lmj0;-><init>(Lgn2;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Luc0;->d:Lmj0;

    .line 38
    .line 39
    sget-object v0, Lag;->l0:Lag;

    .line 40
    .line 41
    new-instance v1, Lmj0;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Lmj0;-><init>(Lgn2;)V

    .line 44
    .line 45
    .line 46
    sput-object v1, Luc0;->e:Lmj0;

    .line 47
    .line 48
    return-void
.end method

.method public static final a(Ljava/lang/Class;)Lev3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Luc0;->a:Lmj0;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lmj0;->Q(Ljava/lang/Class;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p0, Lev3;

    .line 14
    .line 15
    return-object p0
.end method
