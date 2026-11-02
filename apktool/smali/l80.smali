.class public final Ll80;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ll80;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll80;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll80;->a:Ll80;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lkx4;Lp50;)Lkx4;
    .locals 2

    .line 1
    new-instance v0, Ld80;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Ld80;-><init>(Lp50;Z)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
