.class public final synthetic Ld95;
.super Lp05;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final X:Ld95;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ld95;

    .line 2
    .line 3
    const-string v1, "getOffsetIsNegative()Ljava/lang/Boolean;"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-class v3, Lgb3;

    .line 7
    .line 8
    const-string v4, "offsetIsNegative"

    .line 9
    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lp05;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ld95;->X:Ld95;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lgb3;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    iput-object p2, p1, Lgb3;->a:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lgb3;

    .line 2
    .line 3
    iget-object p0, p1, Lgb3;->a:Ljava/lang/Boolean;

    .line 4
    .line 5
    return-object p0
.end method
