.class public abstract Ly80;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lz01;

.field public static final b:Lx80;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh80;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lh80;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lz01;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lz01;-><init>(Lgn2;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Ly80;->a:Lz01;

    .line 13
    .line 14
    new-instance v0, Lx80;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ly80;->b:Lx80;

    .line 20
    .line 21
    return-void
.end method
