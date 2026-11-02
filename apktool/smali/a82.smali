.class public final La82;
.super Lzz3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final f:La82;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La82;

    .line 2
    .line 3
    new-instance v1, Lve4;

    .line 4
    .line 5
    const-string v2, "FallbackBuiltIns"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lve4;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lzz3;-><init>(Lve4;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lzz3;->c()V

    .line 14
    .line 15
    .line 16
    sput-object v0, La82;->f:La82;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final q()Lpo5;
    .locals 0

    .line 1
    sget-object p0, Llh4;->v0:Llh4;

    .line 2
    .line 3
    return-object p0
.end method
