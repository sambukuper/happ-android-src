.class public abstract Lx63;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lf4;

.field public static final b:Lf4;

.field public static final c:Lf4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf4;

    .line 2
    .line 3
    const-string v1, "GET"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf4;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lx63;->a:Lf4;

    .line 9
    .line 10
    new-instance v0, Lf4;

    .line 11
    .line 12
    sget-object v1, Lq35;->b:Lq35;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lf4;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lx63;->b:Lf4;

    .line 18
    .line 19
    new-instance v0, Lf4;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Lf4;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lx63;->c:Lf4;

    .line 26
    .line 27
    return-void
.end method
