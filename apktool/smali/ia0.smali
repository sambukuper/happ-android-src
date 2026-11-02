.class public final synthetic Lia0;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# static fields
.field public static final X:Lia0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lia0;

    .line 2
    .line 3
    const-string v4, "registerAllExtensions(Lorg/jetbrains/kotlin/protobuf/ExtensionRegistryLite;)V"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, Lpa0;

    .line 8
    .line 9
    const-string v3, "registerAllExtensions"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lno2;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lia0;->X:Lia0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr62;

    .line 2
    .line 3
    invoke-static {p1}, Lpa0;->a(Lr62;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    return-object p0
.end method
